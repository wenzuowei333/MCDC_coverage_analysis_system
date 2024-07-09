package com.parser;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.pojo.DecisionNode;
import com.pojo.DecisionTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.InputOutput.*;

public class CodeParser {
    private static Stack<DecisionNode> nodeStack = new Stack<>();

    public static DecisionTree findConditions(String filePath, String language) throws IOException, InterruptedException {
        String code;
        try {
            code = CodeReader.readFile(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            throw e;
        }

        if (code == null || code.isEmpty()) {
            System.err.println("The file is empty or couldn't be read.");
            return new DecisionTree(new DecisionNode("Empty or unreadable file"));
        }

        DecisionNode root = new DecisionNode("Root");
        switch (language.toLowerCase()) {
            case "java":
                parseJavaCode(filePath, code, root);
                break;
            case "python":
                parsePythonCode(filePath, code, root);
                root = root.children.get(0); // 修正为根节点的第一个子节点
                break;
            case "c":
                parseCCode(filePath, code, root);
                break;
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }

        return new DecisionTree(root);
    }

    private static void parseJavaCode(String filePath, String code, DecisionNode root) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(code);
//            // 创建 ImportDeclaration 对象并添加到 CompilationUnit
//            ImportDeclaration importDeclaration = new ImportDeclaration(new Name("com.example.CodeInstrumentor"), false, false);
//            if (!cu.getImports().contains(importDeclaration)) {
//                cu.getImports().add(importDeclaration);
//            }

            System.out.println(cu);

            // 添加打印覆盖数据
            // 遍历 CompilationUnit 中的所有类，找到包含 main 方法的类
            Optional<ClassOrInterfaceDeclaration> mainClassOptional = cu.findAll(ClassOrInterfaceDeclaration.class).stream()
                    .filter(classOrInterface -> classOrInterface.getMethodsByName("main").stream()
                            .anyMatch(method -> method.getParameters().size() == 1
                                    && method.getParameter(0).getType().asString().equals("String[]")
                                    && method.getType().asString().equals("void")
                                    && method.isStatic()))
                    .findFirst();

            // 找到 main 方法
            ClassOrInterfaceDeclaration mainClass = mainClassOptional.orElseThrow(() -> new RuntimeException("Main class not found"));
            MethodDeclaration mainMethod = mainClass.getMethodsByName("main").get(0);

//            // 添加打印覆盖数据的语句到 main 方法的最后
//            BlockStmt body = mainMethod.getBody().orElseThrow(() -> new RuntimeException("Main method body not found"));
//            body.addStatement("System.out.println(com.example.CodeInstrumentor.getCoverageDataString());");
            nodeStack.push(root);

            cu.accept(new VoidVisitorAdapter<Void>() {
                @Override
                public void visit(IfStmt n, Void arg) {
                    DecisionNode currentParent = nodeStack.peek();
                    DecisionNode newNode = new DecisionNode(n.getCondition().toString());
                    currentParent.addChild(newNode);
                    nodeStack.push(newNode);

                    Expression instrumentedCondition = StaticJavaParser.parseExpression(
                            InstrumentationHelper.getInstrumentedCondition(n.getCondition().toString(), "java")
                    );
                    n.setCondition(instrumentedCondition);

                    super.visit(n, arg);
                    nodeStack.pop();
                }

                @Override
                public void visit(WhileStmt n, Void arg) {
                    DecisionNode currentParent = nodeStack.peek();
                    DecisionNode newNode = new DecisionNode(n.getCondition().toString());
                    currentParent.addChild(newNode);
                    nodeStack.push(newNode);

                    Expression instrumentedCondition = StaticJavaParser.parseExpression(
                            InstrumentationHelper.getInstrumentedCondition(n.getCondition().toString(), "java")
                    );
                    n.setCondition(instrumentedCondition);

                    super.visit(n, arg);
                    nodeStack.pop();
                }

                @Override
                public void visit(SwitchStmt n, Void arg) {
                    DecisionNode currentParent = nodeStack.peek();
                    DecisionNode switchNode = new DecisionNode("Switch on " + n.getSelector().toString());
                    currentParent.addChild(switchNode);
                    nodeStack.push(switchNode);

                    for (SwitchEntry entry : n.getEntries()) {
                        String caseLabel = entry.getLabels().isEmpty() ? "default" : entry.getLabels().toString();
                        DecisionNode caseNode = new DecisionNode(caseLabel);
                        switchNode.addChild(caseNode);
                        nodeStack.push(caseNode);

                        entry.getStatements().forEach(stmt -> stmt.accept(this, arg));
                        nodeStack.pop();
                    }

                    nodeStack.pop();
                    super.visit(n, arg);
                }


                @Override
                public void visit(BinaryExpr n, Void arg) {
                    super.visit(n, arg);

                    if (n.getOperator() == BinaryExpr.Operator.AND || n.getOperator() == BinaryExpr.Operator.OR) {
                        DecisionNode currentParent = nodeStack.peek();
                        DecisionNode expressionNode = new DecisionNode(n.toString());
                        currentParent.addChild(expressionNode);
                        processExpressionPart(n.getLeft(), expressionNode);
                        processExpressionPart(n.getRight(), expressionNode);
                    }
                }


                private void processExpressionPart(Expression part, DecisionNode parent) {
                    if (part instanceof BinaryExpr) {
                        BinaryExpr binaryPart = (BinaryExpr) part;
                        if (binaryPart.getOperator() == BinaryExpr.Operator.AND || binaryPart.getOperator() == BinaryExpr.Operator.OR) {
                            visit(binaryPart, null);
                        } else {
                            DecisionNode childNode = new DecisionNode(part.toString());
                            parent.addChild(childNode);
                        }
                    } else {
                        DecisionNode childNode = new DecisionNode(part.toString());
                        parent.addChild(childNode);
                    }
                }
            }, null);

            // 修改类名为原类名加上 _deal 后缀
            cu.getTypes().forEach(type -> {
                String newName = type.getNameAsString() + "_deal";
                type.setName(newName);
            });

            // 将修改后的代码写回文件
            try (FileWriter writer = new FileWriter(filePath.replace(".java", "_deal.java"))) {
                writer.write(cu.toString());
            }
            System.out.println("----------------------------------------------------------");
        } catch (Exception e) {
            System.err.println("解析Java代码出现错误: " + e.getMessage());
        }
    }

    private static void parsePythonCode(String filePath, String code, DecisionNode root) throws InterruptedException, IOException {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/main/java/com/parser/parse_python.py");
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            writer.write(code);
            writer.close();

            process.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder jsonOutput = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonOutput.append(line);
            }

            JSONObject jsonTree = new JSONObject(jsonOutput.toString());
            buildDecisionTree(root, jsonTree);

            String instrumentedCode = insertPythonInstrumentationCode(code, jsonTree);
            String newFilePath = filePath.replace(".py", "_deal.py");
            Files.write(Paths.get(newFilePath), instrumentedCode.getBytes());
            System.out.println("----------------------------------------------------------");

        } catch (Exception e) {
            System.err.println("解析python代码出现错误: " + e.getMessage());
        }
    }

    private static String insertPythonInstrumentationCode(String code, JSONObject jsonTree) {
        // 插入 log_condition 函数定义
        String logConditionFunction = "def log_condition(condition, outcome):\n"
                + "    print(f\"Condition: {condition}, Outcome: {outcome}\")\n"
                + "    return outcome\n";

        // 替换 if 条件为 log_condition 调用
        String instrumentedCode = logConditionFunction + code.replaceAll("if (.*):", "if log_condition(\"$1\", $1):");
        return instrumentedCode;
    }

    private static void parseCCode(String filePath, String code, DecisionNode root) {
        try {
            // 解析 C 代码，生成决策树
            CharStream input = CharStreams.fromString(code);
            CLanguageLexer lexer = new CLanguageLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CLanguageParser parser = new CLanguageParser(tokens);
            ParseTree tree = parser.compilationUnit();

            nodeStack.push(root);

            CLanguageBaseListener extractor = new CLanguageBaseListener() {
                @Override
                public void enterSelectionStatement(CLanguageParser.SelectionStatementContext ctx) {
                    if (ctx.If() != null) {
                        DecisionNode currentParent = nodeStack.peek();
                        String condition = ctx.expression().getText();
                        DecisionNode newNode = new DecisionNode(condition);
                        currentParent.addChild(newNode);
                        nodeStack.push(newNode);

                        super.enterSelectionStatement(ctx);
                        nodeStack.pop();
                    }
                }
            };

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(extractor, tree);

            // 生成插桩代码
            String instrumentedCode = insertCInstrumentationCode(code, root);
            String newFilePath = filePath.replace(".c", "_deal.c");
            Files.write(Paths.get(newFilePath), instrumentedCode.getBytes());
            System.out.println("代码插桩已完成，文件保存至: " + newFilePath);

        } catch (Exception e) {
            System.err.println("解析C语言代码出现错误: " + e.getMessage());
        }
    }

    private static String insertCInstrumentationCode(String code, DecisionNode root) {
        // 插入 log_condition 函数定义
        String logConditionFunction = "def log_condition(condition, outcome):\n"
                + "    print(f\"Condition: {condition}, Outcome: {outcome}\")\n"
                + "    return outcome\n";


        // 收集所有条件
        List<String> conditions = new ArrayList<>();
        collectConditions(root, conditions);

        // 插桩条件
        for (String condition : conditions) {
            code = code.replace(condition, "log_condition(\"" + condition + "\", " + condition + ")");
        }

        // 添加 log_condition 函数定义到代码顶部
        code = logConditionFunction + code;
        return code;
    }

    private static void collectConditions(DecisionNode node, List<String> conditions) {
        if (!node.condition.equals("Root")) {
            conditions.add(node.condition);
        }
        for (DecisionNode child : node.children) {
            collectConditions(child, conditions);
        }
    }

    private static void buildDecisionTree(DecisionNode parent, JSONObject nodeJson) {
        String condition = nodeJson.getString("condition");
        JSONArray children = nodeJson.getJSONArray("children");

        DecisionNode node = new DecisionNode(condition);
        parent.addChild(node);

        for (int i = 0; i < children.length(); i++) {
            buildDecisionTree(node, children.getJSONObject(i));
        }
    }

    public static class InstrumentationHelper {
        public static String getInstrumentedCondition(String condition, String language) {
            switch (language.toLowerCase()) {
                case "java":
                    return "CodeInstrumentor.logCondition(\"" + condition + "\", " + condition + ")";
                case "python":
                    return "log_condition(\"" + condition + "\", " + condition + ")";
                case "c":
                    return "log_condition(\"" + condition + "\", " + condition + ")";
                default:
                    throw new IllegalArgumentException("Unsupported language: " + language);
            }
        }
    }
}

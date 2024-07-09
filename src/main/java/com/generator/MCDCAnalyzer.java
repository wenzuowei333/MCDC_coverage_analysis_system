package com.generator;

import com.executor.CodeExecutor;
import com.parser.CodeParser;
import com.pojo.DecisionTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MCDCAnalyzer {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/example/SampleCode_v2.java";  // 修改为实际文件路径
        String language = "java";

        // 调用生成决策树，同时完成读取代码，解析代码，生成决策树，完成代码插桩的功能
        DecisionTree decisionTree = DecisionTreeGenerator.generateAndPrintDecisionTree(filePath, language);
        System.out.println("----------------------------------------------------------");

        MCDCTestCaseGenerator testCaseGenerator = new MCDCTestCaseGenerator(decisionTree);
        Set<String> testCases = testCaseGenerator.generateMCDCases();
        System.out.println("生成MCDC测试用例:");
        for (String testCase : testCases) {
            System.out.println(testCase);
        }
        System.out.println("----------------------------------------------------------");

        List<Map<String, Integer>> testInputs = TestParameterGenerator.generateTestInputs(testCases);
        System.out.println("参数化测试用例:");
        for (Map<String, Integer> testInput : testInputs) {
            System.out.println(testInput);
        }
        System.out.println("----------------------------------------------------------");

        Map<String, Boolean> coverage = getStringBooleanMap(testCases, testInputs, language, filePath);

        System.out.println("----------------------------------------------------------");

            long coveredConditions = coverage.values().stream().filter(covered -> covered).count();
            double coverageRate = (double) coveredConditions / coverage.size() * 100;
            System.out.println("MCDC 覆盖率: " + coverageRate + "%");


    }

    private static Map<String, Boolean> getStringBooleanMap(Set<String> testCases, List<Map<String, Integer>> testInputs, String language, String filePath) {
        Map<String, Boolean> coverage = new HashMap<>();
        for (String condition : testCases) {
            coverage.put(condition, false);
        }

        System.out.println("执行测试用例:");
        for (Map<String, Integer> testInput : testInputs) {
            String[] inputArgs = testInput.values().stream().map(String::valueOf).toArray(String[]::new);
            String output;
            switch (language.toLowerCase()) {
                case "java":
                    output = CodeExecutor.executeJavaCode(filePath.replace(".java", "_deal.java"), inputArgs);
                    break;
                case "python":
                    output = CodeExecutor.executePythonCode(filePath.replace(".py", "_deal.py"), inputArgs);
                    break;
                case "c":
                    output = CodeExecutor.executeCCode(filePath.replace(".c", "_deal.c"), inputArgs);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported language: " + language);
            }
            System.out.println("执行结果:");
            System.out.println(output);

            for (String condition : testCases) {
                if (output.contains("Branch tested")) {
                    coverage.put(condition, true);
                }
            }
        }
        return coverage;
    }
}

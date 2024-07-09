package com.generator;


import com.parser.CodeParser;
import com.pojo.DecisionTree;
import java.io.IOException;

public class DecisionTreeGenerator {

    public static DecisionTree generateAndPrintDecisionTree(String filePath, String language) {
        DecisionTree decisionTree = null;
        try {
            decisionTree = CodeParser.findConditions(filePath, language);
            System.out.println("生成决策树:");
            decisionTree.printTree();
        } catch (IOException | InterruptedException e) {
            System.err.println("生成决策树时出错: " + e.getMessage());
        }
        return decisionTree;
    }
}
package com.generator;

import com.pojo.DecisionNode;
import com.pojo.DecisionTree;

import java.util.HashSet;
import java.util.Set;

public class MCDCTestCaseGenerator {
    private DecisionTree decisionTree;

    public MCDCTestCaseGenerator(DecisionTree decisionTree) {
        this.decisionTree = decisionTree;
    }

    public Set<String> generateMCDCases() {
        Set<String> testCases = new HashSet<>();
        for (DecisionNode child : decisionTree.root.children) {
            generateMCDCases(child, new HashSet<>(), testCases, true, child.condition);
            generateMCDCases(child, new HashSet<>(), testCases, false, child.condition);
        }
        return testCases;
    }

    private void generateMCDCases(DecisionNode node, Set<String> pathConditions, Set<String> testCases, boolean truthValue, String targetCondition) {
        if (node == null) return;

        // 当前节点条件修改，基于真值
        String modifiedCondition = truthValue ? node.condition : "!(" + node.condition + ")";
        Set<String> newPathConditions = new HashSet<>(pathConditions);
        newPathConditions.add(modifiedCondition);

        // 仅在叶节点处生成完整测试用例
        if (node.children.isEmpty()) {
            // 测试用例字符串构建
            String testCase = String.join(" && ", newPathConditions);
            testCase += " -> Outcome: " + (node.condition.equals(targetCondition) && truthValue ? "True" : "False");
//            testCase += " (Testing '" + targetCondition + "' with " + (truthValue ? "TRUE" : "FALSE") + ")";
            testCases.add(testCase);
        } else {
            // 为每个子节点生成测试用例
            for (DecisionNode child : node.children) {
                generateMCDCases(child, newPathConditions, testCases, true, targetCondition.equals(child.condition) ? child.condition : targetCondition);
                generateMCDCases(child, newPathConditions, testCases, false, targetCondition.equals(child.condition) ? child.condition : targetCondition);
            }
        }
    }

}

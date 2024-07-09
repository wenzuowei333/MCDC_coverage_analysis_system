package com.pojo;

public class DecisionTree {
    public DecisionNode root; // 树的根节点，表示最外层的 `if` 语句

    // 构造函数
    public DecisionTree(DecisionNode root) {
        this.root = root;
    }

    // 一个方法来打印决策树，用于调试和可视化
    public void printTree() {
        printNode(root, "");
    }

    private void printNode(DecisionNode node, String prefix) {
        System.out.println(prefix + node.condition);
        for (DecisionNode child : node.children) {
            printNode(child, prefix + "  ");
        }
    }
}
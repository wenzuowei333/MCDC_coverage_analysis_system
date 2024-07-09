package com.pojo;

import java.util.ArrayList;
import java.util.List;

/**
* 于决策树的示例数据结构，用于表示和跟踪 if 语句及其嵌套关系
* */

public class DecisionNode {
    public String condition; // 存储决策条件的文本
    public List<DecisionNode> children; // 存储子决策节点，表示嵌套的 `if` 语句

    // 构造函数
    public DecisionNode(String condition) {
        this.condition = condition;
        this.children = new ArrayList<>();
    }

    // 添加子节点的方法
    public void addChild(DecisionNode child) {
        this.children.add(child);
    }

}

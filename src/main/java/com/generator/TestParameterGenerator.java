package com.generator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestParameterGenerator {

    /**
     * 从MCDC测试用例中生成测试输入参数。
     * 此方法解析包含逻辑条件的字符串集合，并为每个条件生成相应的测试参数。
     *
     * @param testCases 一组MCDC测试用例。
     * @return 生成的每个测试用例的变量和值的映射列表。
     */
    public static List<Map<String, Integer>> generateTestInputs(Set<String> testCases) {
        List<Map<String, Integer>> allTestInputs = new ArrayList<>();
        Pattern pattern = Pattern.compile("(!\\()?\\s*([a-zA-Z]+)\\s*(>|>=|<|<=)\\s*(\\d+)(\\))?");

        // 动态提取所有变量
        Set<String> allVariables = new HashSet<>();

        for (String testCase : testCases) {
            Map<String, Integer> testInput = new HashMap<>();
            Matcher matcher = pattern.matcher(testCase);
            while (matcher.find()) {
                boolean isNegated = matcher.group(1) != null;  // 检查是否有否定符号
                String variable = matcher.group(2);
                String operator = matcher.group(3);
                int value = Integer.parseInt(matcher.group(4));

                allVariables.add(variable);  // 收集变量名

                // 根据操作符和是否有否定符号计算对应的测试值
                if (isNegated) {
                    switch (operator) {
                        case ">":
                            testInput.put(variable, value);  // !(x > 3) becomes x <= 3, i.e., x = 3
                            break;
                        case "<":
                            testInput.put(variable, value);  // !(x < 3) becomes x >= 3, i.e., x = 3
                            break;
                        case ">=":
                            testInput.put(variable, value - 1);  // !(x >= 3) becomes x < 3, i.e., x = 2
                            break;
                        case "<=":
                            testInput.put(variable, value + 1);  // !(x <= 3) becomes x > 3, i.e., x = 4
                            break;
                    }
                } else {
                    switch (operator) {
                        case ">":
                            testInput.put(variable, value + 1);  // x > 3 becomes x = 4
                            break;
                        case "<":
                            testInput.put(variable, value - 1);  // x < 3 becomes x = 2
                            break;
                        case ">=":
                            testInput.put(variable, value);      // x >= 3 becomes x = 3
                            break;
                        case "<=":
                            testInput.put(variable, value);      // x <= 3 becomes x = 3
                            break;
                    }
                }
            }
            allTestInputs.add(testInput);
        }

        // 为每个测试用例添加未定义变量的默认值
        for (Map<String, Integer> testInput : allTestInputs) {
            for (String variable : allVariables) {
                testInput.putIfAbsent(variable, 0);
            }
        }

        return allTestInputs;
    }
}

package com.example;

import java.util.HashMap;
import java.util.Map;

public class CodeInstrumentor {
    private static Map<String, Boolean> coverageMap = new HashMap<>();

    public static void resetCoverage() {
        coverageMap.clear();
    }

    public static boolean logCondition(String condition, boolean outcome) {
        coverageMap.put(condition, outcome);
        String logMessage = "Condition: " + condition + ", Outcome: " + outcome;
        System.out.println(logMessage);
        System.out.println("Branch tested\n");
        return outcome;
    }

    public static Map<String, Boolean> getCoverageData() {
        return new HashMap<>(coverageMap);
    }

    // 返回字符串类型的覆盖数据
    public static String getCoverageDataString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Boolean> entry : coverageMap.entrySet()) {
            sb.append(entry.getKey()).append(" -> Outcome: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

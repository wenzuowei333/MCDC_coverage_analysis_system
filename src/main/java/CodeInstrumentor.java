import java.util.HashMap;
import java.util.Map;

public class CodeInstrumentor {
    private static Map<String, Boolean> coverageMap = new HashMap<>();

    public static void resetCoverage() {
        coverageMap.clear();
    }

    public static boolean logCondition(String condition, boolean outcome) {
        coverageMap.put(condition, outcome);
        return outcome;
    }

    public static Map<String, Boolean> getCoverageData() {
        return coverageMap;
    }
}

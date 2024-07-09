//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class MCDCTestCaseGeneratorTest {
//
//    @Test
//    public void testGenerateTestCases() {
//        List<String> conditions = Arrays.asList("A", "B && C");
//        List<String[]> testCases = com.generator.MCDCTestCaseGenerator.generateTestCases(conditions);
//        assertNotNull(testCases);
//        assertEquals(4, testCases.size());
//
//        String[][] expectedTestCases = {
//                {"false", "false"},
//                {"true", "false"},
//                {"false", "true"},
//                {"true", "true"}
//        };
//
//        for (int i = 0; i < expectedTestCases.length; i++) {
//            assertArrayEquals(expectedTestCases[i], testCases.get(i));
//        }
//    }
//}

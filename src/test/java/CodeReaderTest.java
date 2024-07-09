import com.InputOutput.CodeReader;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class CodeReaderTest {

    @Test
    public void testReadFile() {
        String filePath = "src/test/java/SampleCode.java"; // Ensure this path is correct
        try {
            String code = CodeReader.readFile(filePath);
            assertNotNull(code);
            assertTrue(code.contains("public class SampleCode"));
        } catch (IOException e) {
            fail("IOException should not have occurred.");
        }
    }
}

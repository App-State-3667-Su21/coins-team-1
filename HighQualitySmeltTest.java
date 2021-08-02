import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HighQualitySmeltTest {
    LowQualitySmelt hqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            hqsObj = new LowQualitySmelt();
            assertNotNull(hqsObj);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
        
    }

    public void TestSmeltBehavior()
    {
        String expectedResult = " 91.67% Cu and 8.33% Zi";
        String actualResult = hqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
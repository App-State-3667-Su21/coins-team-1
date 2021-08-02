import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HighQualitySmeltTest {
    HighQualitySmelt hqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            hqsObj = new HighQualitySmelt();
            assertNotNull(hqsObj);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
        
    }

    @Test
    public void TestSmeltBehavior()
    {
        hqsObj = new HighQualitySmelt();
        String expectedResult = " 91.67% Cu and 8.33% Zi";
        String actualResult = hqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LowQualitySmeltTest {
    LowQualitySmelt lqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            lqsObj = new LowQualitySmelt();
            assertNotNull(lqsObj);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void TestSmeltBehavior()
    {
        lqsObj = new LowQualitySmelt();
        String expectedResult = " 2.5% Cu and 97.5% Zi";
        String actualResult = lqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
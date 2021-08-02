import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedQualitySmeltTest {
    LowQualitySmelt mqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            mqsObj = new LowQualitySmelt();
            asserNotNull(mqsObj);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
    }

    public void TestSmeltBehavior()
    {
        String expectedResult = " 2.5% Cu and 97.5% Zi";
        String actualResult = mqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
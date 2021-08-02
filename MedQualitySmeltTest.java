import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedQualitySmeltTest {
    MedQualitySmelt mqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            mqsObj = new MedQualitySmelt();
            assertNotNull(mqsObj);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void TestSmeltBehavior()
    {
        mqsObj = new MedQualitySmelt();
        String expectedResult = " 75% Cu and 25% Zi";
        String actualResult = mqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
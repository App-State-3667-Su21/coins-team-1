import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HIghestQualitySmeltTest {
    HighestQualitySmelt hqsObj = null;
    @Test
    public void TestConstructor()
    {

        try {            
            hqsObj = new HighestQualitySmelt();
            asserNotNull(hQSmelt);
        } catch (Exception e) {
            
            fail("Error occured upon the constructor!: " + e.getLocalizedMessage());
        }
    }

    public void TestSmeltBehavior()
    {
        String expectedResult = " 88.5% Cu, 6% Zi, 3.5% Mn, and 2% Ni";
        String actualResult = hqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
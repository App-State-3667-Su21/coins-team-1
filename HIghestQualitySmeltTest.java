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
        String expectedResult = "";
        String actualResult = hqsObj.smelt();
        assertTrue(expectedResult.equals(actualResult),
        "Expected: '" + expectedResult + "' but got'" + actualResult + "''.");
    }
}
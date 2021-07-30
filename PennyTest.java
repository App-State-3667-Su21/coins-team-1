import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PennyTest {
    
    @Test
    public void TestPennyConstructor() {
        try {
            Penny p = new Penny();
            assertNotNull(p);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestPennyName() {

	Penny p = new Penny();
	String expectedResult = "Penny";
	String testOutput = null;
	testOutput = p.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    public void TestPennyValue() {

        Penny p = new Penny();
        double expectedResult = 0.01;
        double testOutput = 0;
        testOutput = p.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    public void TestPennyMint() {

        Penny p = new Penny();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = p.getCoinCommonName();
        assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            "' but got '" + testOutput + "'.");
        }
}
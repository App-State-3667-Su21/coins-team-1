import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PennyTest {
    
    @Test
    public void TestConstructor() {
        try {
            Penny p = new Penny();
            assertNotNull(p);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

	Penny p = new Penny();
	String expectedResult = "Penny";
	String testOutput = null;
	testOutput = p.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        Penny p = new Penny();
        double expectedResult = 0.01;
        double testOutput = 0;
        testOutput = p.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        Penny p = new Penny();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = p.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
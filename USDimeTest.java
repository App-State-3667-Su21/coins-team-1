import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class USDimeTest {
    
    @Test
    public void TestConstructor() {
        try {
            USDime d = new USDime();
            assertNotNull(d);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

    USDime d = new USDime();
	String expectedResult = "Dime";
	String testOutput = null;
	testOutput = d.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        USDime d = new USDime();
        double expectedResult = 0.10;
        double testOutput = 0;
        testOutput = d.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        USDime d = new USDime();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = d.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
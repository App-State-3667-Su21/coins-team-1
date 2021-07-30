import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LoonieTest {
    
    @Test
    public void TestConstructor() {
        try {
            Loonie coin = new Loonie();
            assertNotNull(coin);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

        Loonie coin = new Loonie();
	String expectedResult = "Loonie";
	String testOutput = null;
	testOutput = coin.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        Loonie coin = new Loonie();
        double expectedResult = 1.00;
        double testOutput = 0;
        testOutput = coin.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        Loonie coin = new Loonie();
        String expectedResult = "CAD";
        String testOutput = null;
        testOutput = coin.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
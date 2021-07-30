import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class HalfDollarTest {
    
    @Test
    public void TestConstructor() {
        try {
            HalfDollar coin = new HalfDollar();
            assertNotNull(coin);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

        HalfDollar coin = new HalfDollar();
	String expectedResult = "Half Dollar";
	String testOutput = null;
	testOutput = coin.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        HalfDollar coin = new HalfDollar();
        double expectedResult = 0.50;
        double testOutput = 0;
        testOutput = coin.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        HalfDollar coin = new HalfDollar();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = coin.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
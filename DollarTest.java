import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class DollarTest {
    
    @Test
    public void TestConstructor() {
        try {
            Dollar coin = new Dollar();
            assertNotNull(coin);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

        Dollar coin = new Dollar();
	String expectedResult = "Dollar Coin";
	String testOutput = null;
	testOutput = coin.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        Dollar coin = new Dollar();
        double expectedResult = 1.00;
        double testOutput = 0;
        testOutput = coin.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        Dollar coin = new Dollar();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = coin.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
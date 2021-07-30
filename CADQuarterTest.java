import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CADQuarterTest {
    
    @Test
    public void TestConstructor() {
        try {
            CADQuarter coin = new CADQuarter();
            assertNotNull(coin);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

        CADQuarter coin = new CADQuarter();
	String expectedResult = "Quarter";
	String testOutput = null;
	testOutput = coin.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        CADQuarter coin = new CADQuarter();
        double expectedResult = 0.25;
        double testOutput = 0;
        testOutput = coin.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        CADQuarter coin = new CADQuarter();
        String expectedResult = "CAD";
        String testOutput = null;
        testOutput = coin.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
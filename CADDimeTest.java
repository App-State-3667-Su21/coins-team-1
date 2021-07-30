import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CADDimeTest {
    
    @Test
    public void TestConstructor() {
        try {
            CADDime coin = new CADDime();
            assertNotNull(coin);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

        CADDime coin = new CADDime();
	String expectedResult = "Dime";
	String testOutput = null;
	testOutput = coin.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        CADDime coin = new CADDime();
        double expectedResult = 0.10;
        double testOutput = 0;
        testOutput = coin.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        CADDime coin = new CADDime();
        String expectedResult = "CAD";
        String testOutput = null;
        testOutput = coin.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
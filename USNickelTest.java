import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class USNickelTest {
    
    @Test
    public void TestConstructor() {
        try {
            USNickel n = new USNickel();
            assertNotNull(n);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }

    }

    @Test
    public void TestCoinName() {

    USNickel n = new USNickel();
	String expectedResult = "Nickel";
	String testOutput = null;
	testOutput = n.getCoinName();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
    
    @Test
    public void TestCoinValue() {

        USNickel n = new USNickel();
        double expectedResult = 0.05;
        double testOutput = 0;
        testOutput = n.getCoinValue();
        assertTrue(expectedResult == testOutput,
               "Expected:'" + expectedResult 
               + "' but got '" + testOutput + "'.");
        }

    @Test
    public void TestCoinMint() {

        USNickel n = new USNickel();
        String expectedResult = "USD";
        String testOutput = null;
        testOutput = n.getCoinCC();
        assertTrue(expectedResult.equals(testOutput),
                "Expected:'" + expectedResult 
                + "' but got '" + testOutput + "'.");
        }
}
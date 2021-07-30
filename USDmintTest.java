import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class USDmintTest {

    PrintStream originalOut;    
	ByteArrayOutputStream baos;
	PrintStream newOut;
   
   
    String breakdownOut() {
        System.out.flush();
        String actualOutput = baos.toString();
        System.setOut(originalOut);
        return actualOutput; 
        }
    
    
    void setUpOut() {
        originalOut = System.out;     // save to restore later
        baos = new ByteArrayOutputStream();
        newOut = new PrintStream(baos);
        System.setOut(newOut);
        }
   
   
    @Test
    public void TestMakeCoin() {

    // Coin coin = new xxCoin();
    USDmint mint = new USDmint();
    // USQuarter Qcoin = new USQuarter();
    // double coin = 0.25; 

	double expectedResult = 0.25;
	double testOutput = 0.0;
	testOutput = mint.makeCoin(0.25).getCoinValue();
	assertTrue(expectedResult == testOutput,
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void TestSmelt() {

    // Coin coin = new xxCoin();
    USDmint mint = new USDmint();
    USQuarter coin = new USQuarter();
    setUpOut(); 
    // double coin = 0.25; 

    mint.smelt(coin);
    String actualOutput = breakdownOut();
	String expectedResult = "Smelting " + coin.getCoinName() + "...completed\n";

    assertEquals(expectedResult, actualOutput);
	// String testOutput = null;
	// testOutput = mint.smelt(coin);
	// assertTrue(expectedResult.equals(testOutput),
	// 	   "Expected:'" + expectedResult 
	// 	   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void TestImprint() {

    // Coin coin = new xxCoin();
    USDmint mint = new USDmint();
    USQuarter coin = new USQuarter();
    setUpOut(); 
    // double coin = 0.25; 

    mint.imprint(coin);
    String actualOutput = breakdownOut();
	String expectedResult = "Imprinting " + coin.getCoinName() + "...completed\n";

    assertEquals(expectedResult, actualOutput);
	// String testOutput = null;
	// testOutput = mint.smelt(coin);
	// assertTrue(expectedResult.equals(testOutput),
	// 	   "Expected:'" + expectedResult 
	// 	   + "' but got '" + testOutput + "'.");
    }

}
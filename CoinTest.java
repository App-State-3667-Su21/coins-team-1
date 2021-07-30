import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class XxxCoin extends Coin {
    public XxxCoin(String cc, String commonName, Double value) {
        super(cc,commonName,value); 
    }
    public String getCoinName(){return "";}
    public String getCoinCC(){return "";}
    public double getCoinValue(){return 0.0;}

}


public class CoinTest {
    @Test
    public void testConstructor() {

	try {
	    Coin coin = new XxxCoin("USD","Penny",0.01);
	    assertNotNull(coin);
	}
	catch (Exception e) {
	    // Should NOT get here, if so then test probably should fail.
	    fail("Constructor threw exception: " + e.getMessage());
	    }
    }


    @Test
    public void TestgetCoinName() {
        Coin coin = new XxxCoin("USD","Penny",0.01);
        String exp = "";
        String testop = null;
        testop = coin.getCoinName();
        assertTrue(exp.equals(testop),
		   "Expected:'" + exp 
		   + "' but got '" + testop + "'.");
        }

        @Test
        public void TestgetCoinCC() {
            Coin coin = new XxxCoin("USD","Penny",0.01);
            String exp = "";
            String testop = null;
            testop = coin.getCoinCC();
            assertTrue(exp.equals(testop),
               "Expected:'" + exp 
               + "' but got '" + testop + "'.");
            }

            @Test
            public void TestgetCoinValue() {
                Coin coin = new XxxCoin("USD","Penny",0.01);
                double exp = 0.0;
                double testop = 0.0;
                testop = coin.getCoinValue();
                assertTrue(exp == testop,
                   "Expected:'" + exp 
                   + "' but got '" + testop + "'.");
                }
}
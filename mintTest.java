import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class XxxMint extends Mint {
    public XxxMint() {}
    public Coin makeCoin(double value){
        USQuarter coin = new USQuarter();
        return coin;}
    public boolean smooth() {return true;}
    public void smelt(Coin coin){
        System.out.println("Smelting Quarter...completed");
    }
    public void imprint(Coin coin){
        System.out.println("Imprinting Quarter...completed");
    }
    public boolean polish() {return true;}
    public boolean inspect() {return true;}
    public boolean checkFail(int num) {return true;}

}


public class mintTest {

    PrintStream originalOut;    
	ByteArrayOutputStream baos;
	PrintStream newOut;
   
   

	void setUpOut() {
		originalOut = System.out; 
		baos = new ByteArrayOutputStream();
		newOut = new PrintStream(baos);
		System.setOut(newOut);
	}

	String breakdownOut() {
		System.out.flush();
		String actualOutput = baos.toString();
		System.setOut(originalOut);
		return actualOutput; 
	}

    @Test
    public void testConstructor() {

	try {
	    Mint mint = new XxxMint();
	    assertNotNull(mint);
	}
	catch (Exception e) {
	    // Should NOT get here, if so then test probably should fail.
	    fail("Constructor threw exception: " + e.getMessage());
	    }
    }


    @Test
    public void TestMakeCoin() {
        Mint mint = new XxxMint();
        double exp = 0.25;
        double testop = 0.0;
        testop = mint.makeCoin(0.25).getCoinValue();
        assertTrue(exp == testop,
		   "Expected:'" + exp 
		   + "' but got '" + testop + "'.");
        }

    @Test
    public void TestSmelt() {
        Mint mint = new XxxMint();
        USQuarter coin = new USQuarter();
        setUpOut();

        mint.smelt(coin);

        String actualOutput = breakdownOut();
	    String expectedResult = "Smelting " + coin.getCoinName() + "...completed\n";
        assertEquals(expectedResult, actualOutput);
        }

        @Test
        public void TestImprint() {
            Mint mint = new XxxMint();
            USQuarter coin = new USQuarter();
            setUpOut();
    
            mint.imprint(coin);
    
            String actualOutput = breakdownOut();
            String expectedResult = "Imprinting " + coin.getCoinName() + "...completed\n";
            assertEquals(expectedResult, actualOutput);
            }

        @Test
        public void TestSmooth() {
            Mint mint = new XxxMint();
            
            boolean expectedOP = true;
            boolean testOp = mint.smooth();
            assertEquals(expectedOP, testOp);
        }

        @Test
        public void TestPolish() {
            Mint mint = new XxxMint();
            
            boolean expectedOP = true;
            boolean testOp = mint.polish();
            assertEquals(expectedOP, testOp);
        }

        @Test
        public void TestInspect() {
            Mint mint = new XxxMint();
            
            boolean expectedOP = true;
            boolean testOp = mint.inspect();
            assertEquals(expectedOP, testOp);
        }

    

}
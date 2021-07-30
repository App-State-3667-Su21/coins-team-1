public class USDmint extends Mint {
    private Coin coin;
 
    public USDmint() {}

    public Coin makeCoin(double value) {
        coin = determineCoin(value);
        // Step #1 Smelting
        smelt(coin);

        // Step #2 Imprinting
        imprint(coin);

        // Step #3 Inspecting
        if (inspect()) {
            System.out.println("Inspecting " + coin.getCoinName() + "...completed");
        }
        else {
            System.out.println("Inspection failed...");
            return null;
        }

        // Step #4 Smoothing
        if (smooth()) {
            System.out.println("Smoothing " + coin.getCoinName() + "...completed");
        } 
        else {
            System.out.println("Smoothing failed...");
            return null;
        }

        // Step #5 Polish
        if (polish()) {
            System.out.println("Smoothing " + coin.getCoinName() + "...completed");
        } 
        else {
            System.out.println("Smoothing failed...");
            return null;
        }

        return coin;
    }

    public void smelt(Coin coin) {
        System.out.println("Smelting " + coin.getCoinName() + "...completed");
    }

    public void imprint(Coin coin) {
        System.out.println("Imprinting " + coin.getCoinName() + "...completed");
    }

    private Coin determineCoin(double value) {
        if (value == 0.01) return new Penny();
        else if (value == 0.05) return new USNickel();
        else if (value == 0.10) return new USDime();
        else if (value == 0.25) return new USQuarter();
        else if (value == 0.50) return new HalfDollar();
        else if (value == 1.00) return new Dollar();
        else return null;
    }
}
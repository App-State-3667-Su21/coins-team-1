public class CADmint extends Mint {
    private Coin coin;
    private static CADmint uniqueInstance;
 
    private CADmint() {}

    public static CADmint getInstance() {
        if (uniqueInstance == null) {
            synchronized (CADmint.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CADmint();
                }
            }
        }
        return uniqueInstance;
    }    

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
            return new NullCoin();
        }

        // Step #4 Smoothing
        if (smooth()) {
            System.out.println("Smoothing " + coin.getCoinName() + "...completed");
        } 
        else {
            System.out.println("Smoothing failed...");
            return new NullCoin();
        }

        // Step #5 Polish
        if (polish()) {
            System.out.println("Smoothing " + coin.getCoinName() + "...completed");
        } 
        else {
            System.out.println("Smoothing failed...");
            return new NullCoin();
        }

        System.out.println("(" + coin.getCoinName() + ")$" + coin.getCoinValue());

        return coin;
    }

    public void smelt(Coin coin) {
        System.out.println("Smelting " + coin.getCoinName() + coin.smelt() + "...completed");
    }

    public void imprint(Coin coin) {
        System.out.println("Imprinting " + coin.getCoinName() + "...completed");
    }

    private Coin determineCoin(double value) {
        if (value == 0.05) return new CADNickel();
        else if (value == 0.10) return new CADDime();
        else if (value == 0.25) return new CADQuarter();
        else if (value == 0.50) return new FiftyCent();
        else if (value == 1.00) return new Loonie();
        else if (value == 2.00) return new Toonie();
        else return new NullCoin();
    }
}
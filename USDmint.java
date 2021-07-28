public class USDmint {
    private static USDmint uniqueInstance;
 
    private USDmint() {}
 
    public static USDmint getInstance() {
        if (uniqueInstance == null) {
            synchronized (USDmint.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new USDmint();
                }
            }
        }
        return uniqueInstance;
    }

    public Coin makeCoin(double value) {
        
    }
}
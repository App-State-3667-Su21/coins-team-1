public class CADmint {
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
        
    }
}
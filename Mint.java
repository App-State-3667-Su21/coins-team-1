import java.util.Random;

abstract class Mint {
    private Random rand = new Random();
    private int randomNum;
    
    public abstract Coin makeCoin(double value);

    abstract void smelt(Coin coin);

    abstract void imprint(Coin coin);

    public boolean smooth() {
        randomNum = rand.nextInt(1000);
        
        System.out.print("Smoothing coin...");

        return checkFail(randomNum);
    }
    
    public boolean polish() {
        randomNum = rand.nextInt(1000);
        
        System.out.print("Polishing coin...");

        return checkFail(randomNum);
    }

    public boolean inspect() {
        randomNum = rand.nextInt(12);
        
        System.out.print("Inspecting coin...");

        return checkFail(randomNum);
    }

    private boolean checkFail(int num) {
        if (num == 1) {
            System.out.println(" Failed.");
            return false;
        } else {
            System.out.println(" Completed.");
            return true;
        }
    }
}

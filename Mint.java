import java.util.Random;

abstract class Mint {
    private Random rand = new Random();
    private int randomNum;
    
    public abstract Coin makeCoin(double value);

    abstract void smelt(Coin coin);

    abstract void imprint(Coin coin);

    public boolean smooth() {
        randomNum = rand.nextInt(1000);
        return checkFail(randomNum);
    }
    
    public boolean polish() {
        randomNum = rand.nextInt(1000);
        return checkFail(randomNum);
    }

    public boolean inspect() {
        randomNum = rand.nextInt(12);
        return checkFail(randomNum);
    }

    private boolean checkFail(int num) {
        return (num != 1);
    }
}

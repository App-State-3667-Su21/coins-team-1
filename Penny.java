public class Penny extends Coin {
    public Penny() {
        super("USD", "Penny", 0.01, new LowQualitySmelt());
    }
}

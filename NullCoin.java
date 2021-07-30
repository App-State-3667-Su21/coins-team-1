public class NullCoin extends Coin{

    public NullCoin(String cc, String commonName, Double value) {
        super("NULL", "Null Coin", 0.0);
        //TODO Auto-generated constructor stub
    }
    
    public NullCoin()
    {
        super("NULL", "Null Coin", 0.0);
    }

    @Override
    public String getCoinName() {
        // TODO Auto-generated method stub
        return "Null Coin";
    }
    
}

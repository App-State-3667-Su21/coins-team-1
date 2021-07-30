abstract class Coin {
    private String cc;
    private String commonName;
    private double value;

    public Coin(String cc, String commonName, Double value) {
        this.cc = cc;
        this.commonName = commonName;
        this.value = value;
    }

    public String getCoinName() {
        return commonName;
    }
}
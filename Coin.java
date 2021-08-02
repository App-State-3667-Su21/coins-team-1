// All coins have some common elements: a value, an identification of the country, motto, metallic composition, 
// year of minting, etc. We are, for now, only concerned about value and country code. 
// And, of course, there are different types of coins for the different countries as specified in the tables below. 
// (Notice that the common names of the coins don't overlap! Except for US and Canadian quarter, dime, nickel. 
// So we will keep the common name for USD and call the Canadian ones CadQuarter, etc.)

abstract class Coin {
    private String cc;
    private String commonName;
    private double value;
    private SmeltBehavior smeltBehavior;

    public Coin(String cc, String commonName, Double value, SmeltBehavior smeltBehavior) {
        this.cc = cc;
        this.commonName = commonName;
        this.value = value;
        this.smeltBehavior = smeltBehavior;
    }

    public String getCoinName() {
        return commonName;
    }

    public String getCoinCC() {
        return cc;
    }

    public double getCoinValue() {
        return value;
    }

    public String smelt() {
        return smeltBehavior.smelt();
    }
}

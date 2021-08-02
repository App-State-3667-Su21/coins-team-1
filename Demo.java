import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Mint mint = null;
        String mintType = "";
        Double coinValue = 99.99;
        Scanner kb = new Scanner(System.in);

        System.out.println("Would you like to create a USD Mint or a CAD Mint? Enter 'USD' or 'CAD':\n");
        mintType = kb.nextLine();

        while (!isValid(mintType)) {
            System.out.println("Unrecognized mint, please try again:\n");
            mintType = kb.nextLine();
        }

        if (mintType.equals("USD")) {
            mint = USDmint.getInstance();
            System.out.println("Using USD: U.S. Coin Factory\n\n");
        } else if (mintType.equals("CAD")) {
            mint = CADmint.getInstance();
            System.out.println("Using CAD: CA Coin Factory\n\n");
        }

        while (true) {
            System.out.print("Enter coin denomination (0.25 = a quarter, 0 to quit): ");
            coinValue = kb.nextDouble();
            if (coinValue == 0.0) System.exit(0);
            mint.makeCoin(coinValue);
        }
    }

    public static boolean isValid(String input) {
        return input.equals("USD") || input.equals("CAD");
    }
}
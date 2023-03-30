package Part3.Shopping;

public class ElectronicShop {

    private static String soldProducts = "You have been sold...";

    private static double cashIncome;
    private static double bankIncome;
    private static double generalIncome;


    public static void sell(Product product) {
        System.out.println("You have sold " + product.getType());
        soldProducts = getSoldProducts().concat(" " + product.getType() + ",");
        cashIncome += product.profit() - discount(product);
        generalIncome = cashIncome + bankIncome;
    }

    public static void sellByCard(Product product) {
        System.out.println("You have sold " + product.getType());
        soldProducts = getSoldProducts().concat(" " + product.getType() + ",");
        bankIncome += product.profit() - discount(product);
        generalIncome = cashIncome + bankIncome;
    }

    public static double discount(Product product) {
        if (product.profit() >= 100000) {
            return product.profit() / 10;
        }
        return 0;
    }

    public static double getCashIncome() {
        System.out.print("Cash Income is ");
        return cashIncome;
    }

    public static double getBankIncome() {
        System.out.print("Bank Income is ");
        return bankIncome;
    }

    public static double getGeneralIncome() {
        System.out.print("General Income is ");
        return generalIncome;
    }

    public static String getSoldProducts() {
        return soldProducts;
    }
}

package Part3.Shopping;

import Part3.Cards.Card;

public class ElectronicShop {

    public static Worker worker = new Worker();
    private static String soldProducts = "You have been sold ";

    private static double cashIncome;
    private static double bankIncome;
    private static double generalIncome;


    public static void sell(Product product) {
        System.out.println("You have sold " + product.getType());
        worker.salary(product.profit() / 20);
        soldProducts = getSoldProducts().concat(" " + product.getType() + ": ");
        cashIncome += product.profit() - discount(product) - (product.profit() / 20);
        generalIncome = cashIncome + bankIncome;
    }

    public static void sellByCard(Product product, BankCard card) {
        if (card.getBalance() > product.getPrice()) {
            card.cashOut(product.getPrice());
            System.out.println("You have sold " + product.getType());
            worker.salary(product.profit() / 20);
            soldProducts = getSoldProducts().concat(" " + product.getType() + ": ");
            bankIncome += product.profit() - discount(product) - (product.profit() / 20);
            generalIncome = cashIncome + bankIncome;
        } else {
            System.out.println("Your balance is not enough");
        }
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

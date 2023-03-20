package Part3.Cards;

public class Standard {

    private double balance;

    public void cashOut(double money) {
        if (balance >= money && money >= 0) {
            balance -= money;
        } else {
            System.out.println("Transaction is rejected");
        }
    }

    public void cashIn(double money) {
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("Transfer failed");
        }
    }

    public double getBalance() {
        return balance;
    }
}

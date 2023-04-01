package Part3.Shopping;

public class BankCard {

    private double balance;

    BankCard(int balance) {
        this.balance = balance;
    }

    public void cashOut(double money) {
        if (balance >= money && money >= 0) {
            balance -= money;
        } else {
            System.out.println("Transaction is rejected");
        }
    }

    public double getBalance() {
        return balance;
    }
}

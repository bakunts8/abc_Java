package Part3.Cards;

public class Gold extends Standard {

    private double extraBalance = 100000;

    public void payLunch(double money) {
        if (extraBalance > money && money >= 0) {
            extraBalance -= money;
        } else {
            System.out.println("Amount is not enough");
        }
    }

    public double getExtraBalance() {
        return extraBalance;
    }
}

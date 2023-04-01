package Part3.Cards;

public class Gold extends Card {

    private double extraBalance = 100000;
    private int bonusPoints;

    public Gold(String name, long l, int ex, String t) {
        setCardholderName(name);
        setCardAccountNumber(l);
        setExpirationYear(ex);
        setCardType(t);
    }

    @Override
    public void cashOut(double money) {
        super.cashOut(money);
        if (isCashOutAllowedInGold) {
            bonusPoints += 2;
            isCashOutAllowedInGold = false;
        }
    }

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

    public int getBonusPoints() {
        return bonusPoints;
    }
}

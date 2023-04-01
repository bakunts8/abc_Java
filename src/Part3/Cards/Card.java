package Part3.Cards;

public abstract class Card {

    private double balance;
    private String cardholderName;
    private long cardAccountNumber;
    private int expirationYear;
    private String cardType;

    // so that the bonus doesn't increase in the event of an invalid condition
    public boolean isCashOutAllowedInGold = false;


    public void cashOut(double money) {
        if (balance >= money && money >= 0) {
            balance -= money;
            isCashOutAllowedInGold = true;
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

    public void onlineShopping(double money) {
        if (balance >= money && money >= 0) {
            balance -= money;
        } else {
            System.out.println("Shopping is not allowed");
        }
    }

    @Override
    public String toString() {
        if (getClass().toString().equals("class Part3.Cards.Standard")) {
            return super.toString();
        }
        return getCardholderName() + " " + getCardAccountNumber() + " " + getExpirationYear() + " " + getCardType();
    }


    public double getBalance() {
        return balance;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public long getCardAccountNumber() {
        return cardAccountNumber;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public void setCardAccountNumber(long cardAccountNumber) {
        this.cardAccountNumber = cardAccountNumber;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}

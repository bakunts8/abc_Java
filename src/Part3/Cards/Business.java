package Part3.Cards;

public class Business extends Card {

    private boolean isCreditAllowed = true;

    public Business(String name, long l, int ex, String t) {
        setCardholderName(name);
        setCardAccountNumber(l);
        setExpirationYear(ex);
        setCardType(t);
    }

    public void credit() {
        if (isCreditAllowed) {
            cashIn(1000000);
            isCreditAllowed = false;
        } else {
            System.out.println("You already used it");
        }
    }

    @Override
    public void onlineShopping(double money) {
        super.onlineShopping(0.9 * money);
    }
}

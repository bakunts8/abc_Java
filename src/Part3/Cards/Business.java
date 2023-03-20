package Part3.Cards;

public class Business extends Standard {

    private boolean isCreditAllowed = true;

    public void credit() {
        if (isCreditAllowed) {
            cashIn(1000000);
            isCreditAllowed = false;
        } else {
            System.out.println("You already used it");
        }
    }
}

package Part3.Cards;

public class Card {

    public static void main(String[] args) {

        Standard my_Standard = new Standard();
        my_Standard.cashIn(50000);
        my_Standard.cashOut(15000);
        System.out.println(my_Standard.getBalance());

        Business my_business = new Business();
        my_business.credit();
        System.out.println(my_business.getBalance());
        my_business.credit();
        System.out.println(my_business.getBalance());

        Gold my_gold = new Gold();
        my_gold.payLunch(15300);
        System.out.println(my_gold.getExtraBalance());
    }
}

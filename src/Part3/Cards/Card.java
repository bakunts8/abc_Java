package Part3.Cards;

public class Card {

    public static void main(String[] args) {
        Standard standard = new Standard();
        Business business = new Business("Khachik Bakunts", 1122334455667788L, 2030, "Business");
        Gold gold = new Gold("Isaac Newton", 1245782356891245L, 1680, "Gold");

        System.out.println(standard);
        System.out.println(business);
        System.out.println(gold);

        business.cashIn(100);
        business.onlineShopping(105);
        System.out.println(business.getBalance());

        gold.cashOut(50);
        System.out.println(gold.getBonusPoints());

        gold.cashIn(50);
        gold.cashOut(30);
        System.out.println(gold.getBonusPoints());
    }
}

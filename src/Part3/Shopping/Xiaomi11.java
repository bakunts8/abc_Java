package Part3.Shopping;

public class Xiaomi11 extends Xiaomi {

    public Xiaomi11(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "11223344";
    }
}

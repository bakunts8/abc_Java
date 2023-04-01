package Part3.Shopping;

public class Xiaomi10 extends Xiaomi {

    public Xiaomi10(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "11115555";
    }
}

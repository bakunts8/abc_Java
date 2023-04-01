package Part3.Shopping;

public abstract class Xiaomi extends AndroidPhone {


    public Xiaomi(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "25252525";
    }
}

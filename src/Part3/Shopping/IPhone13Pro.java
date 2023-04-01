package Part3.Shopping;

public class IPhone13Pro extends IPhone {


    public IPhone13Pro(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "12345688";
    }

}

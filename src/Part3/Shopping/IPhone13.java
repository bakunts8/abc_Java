package Part3.Shopping;

public class IPhone13 extends IPhone {


    public IPhone13(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "78787878";
    }


}

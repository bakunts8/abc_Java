package Part3.Shopping;

public abstract class Phone extends Product {

    private boolean isConnectingToWiFi = false;

    public Phone(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 1 year guarantee");
    }

    public boolean getIsConnectingToWiFi() {
        return isConnectingToWiFi;
    }

    public void connectToSharedWiFi(Phone phone, String password) {
        isConnectingToWiFi = false;
        if (password.equals(phone.generateWiFiPassword())) {
            isConnectingToWiFi = true;
            System.out.println("connected");
        } else {
            System.out.println("wrong password");
        }
    }

    public abstract String generateWiFiPassword();
}

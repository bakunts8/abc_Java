package Part3.Shopping;

public class SamsungGalaxyA73 extends SamsungPhones {

    public SamsungGalaxyA73(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }


    @Override
    public String generateWiFiPassword() {
        return "10203040";
    }

    @Override
    public void cameraInfo() {
        System.out.println("Galaxy A73 has 64 MP camera");
    }

}

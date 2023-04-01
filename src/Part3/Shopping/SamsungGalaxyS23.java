package Part3.Shopping;

public class SamsungGalaxyS23 extends SamsungPhones {

    public SamsungGalaxyS23(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public String generateWiFiPassword() {
        return "10152025";
    }

    @Override
    public void cameraInfo() {
        System.out.println("Galaxy S23 has 128 MP very beautiful camera");
    }

}

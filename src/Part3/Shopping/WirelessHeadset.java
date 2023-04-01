package Part3.Shopping;

public abstract class WirelessHeadset extends Headset {


    public WirelessHeadset(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }
    @Override
    public void volume() {
        System.out.println("volume is 500 Hz");
    }
}

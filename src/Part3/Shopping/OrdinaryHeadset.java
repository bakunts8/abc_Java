package Part3.Shopping;

public abstract class OrdinaryHeadset extends Headset {


    public OrdinaryHeadset(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void volume() {
        System.out.println("volume is 800 Hz");
    }
}

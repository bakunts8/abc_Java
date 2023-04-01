package Part3.Shopping;

public class LG_OLed extends LG {

    public LG_OLed(String type, int price, int costPrice, int screenSize) {
        super(type, price, costPrice, screenSize);
    }

    @Override
    public void screenQuality() {
        System.out.println("This TV has a screen with good enough quality");
    }
}

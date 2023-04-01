package Part3.Shopping;

public abstract class SmartTV extends TV {


    public SmartTV(String type, int price, int costPrice, int screenSize) {
        super(type, price, costPrice, screenSize);
    }

    public abstract void screenQuality();
}

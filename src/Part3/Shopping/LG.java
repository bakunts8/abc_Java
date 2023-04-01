package Part3.Shopping;

public abstract class LG extends SmartTV {

    public LG(String type, int price, int costPrice, int scrrenSize) {
        super(type, price, costPrice, scrrenSize);
    }

    @Override
    public void screenQuality() {
        System.out.println("This TV has 4K display");
    }
}

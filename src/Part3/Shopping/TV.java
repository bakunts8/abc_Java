package Part3.Shopping;

public abstract class TV extends Product {

    private int screenSize;

    public TV(String type, int price, int costPrice, int screenSize) {
        super(type, price, costPrice);
        setScreenSize(screenSize);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 2 year guarantee");
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}

package Part3.Shopping;

public abstract class Headset extends Product {


    public Headset(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void guarantee() {
        System.out.println("this product have 6 mount guarantee");
    }

    public abstract void volume();
}

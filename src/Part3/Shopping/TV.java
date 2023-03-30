package Part3.Shopping;

public abstract class TV extends Product {


    public TV(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 2 year guarantee");
    }
}

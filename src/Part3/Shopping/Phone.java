package Part3.Shopping;

public abstract class Phone extends Product {

    public Phone(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 1 year guarantee");
    }
}

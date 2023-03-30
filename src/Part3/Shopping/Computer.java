package Part3.Shopping;

public abstract class Computer extends Product {


    public Computer(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 1.5 year guarantee");
    }
}

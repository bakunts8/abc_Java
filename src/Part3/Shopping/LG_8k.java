package Part3.Shopping;

public class LG_8k extends LG {

    public LG_8k(String type, int price, int costPrice, int screenSize) {
        super(type, price, costPrice, screenSize);
    }


    @Override
    public void screenQuality() {
        System.out.println("This TV has 8K display");
    }
}

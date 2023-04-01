package Part3.Shopping;

public class HP_Notebook2045 extends Notebook {


    public HP_Notebook2045(String type, int price, int costPrice, int ssd) {
        super(type, price, costPrice, ssd);
    }

    @Override
    public void screenPicture() {
        if (EnableDisable()) {
            picture();
            System.out.println("HP 2045");
            picture();
        }
    }
}

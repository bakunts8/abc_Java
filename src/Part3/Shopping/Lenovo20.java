package Part3.Shopping;

public class Lenovo20 extends Notebook {


    public Lenovo20(String type, int price, int costPrice, int ssd) {
        super(type, price, costPrice, ssd);
    }

    @Override
    public void screenPicture() {
        if (EnableDisable()) {
            picture();
            System.out.println("Lenovo");
            picture();
        }
    }
}

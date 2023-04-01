package Part3.Shopping;

public class Dell_Inspiron extends Notebook {


    public Dell_Inspiron(String type, int price, int costPrice, int ssd) {
        super(type, price, costPrice, ssd);
    }

    @Override
    public void screenPicture() {
        if (EnableDisable()) {
            picture();
            System.out.println("DELL 3554");
            picture();
        }
    }

}

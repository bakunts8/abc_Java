package Part3.Shopping;

public class AcerDesktop10 extends DesktopComp {



    public AcerDesktop10(String type, int price, int costPrice, int ssd) {
        super(type, price, costPrice, ssd);
    }

    @Override
    public void screenPicture() {
        if (EnableDisable()) {
            picture();
            System.out.println("Acer 10");
            picture();
        }
    }


}

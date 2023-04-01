package Part3.Shopping;

public abstract class Computer extends Product {

    private int SSD_Capacity;
    private boolean isEnabledComp = false;


    public Computer(String type, int price, int costPrice, int ssd) {
        super(type, price, costPrice);
        setSSD_Capacity(ssd);
    }

    @Override
    public void guarantee() {
        System.out.println(super.getType() + " has 1.5 year guarantee");
    }

    public boolean EnableDisable() {
        isEnabledComp = !isEnabledComp;
        return isEnabledComp;
    }

    public abstract void screenPicture();
    public void picture() {
        for (int i = 0; i < 2; i++) {
            System.out.println("**************");
        }
    }

    public void setSSD_Capacity(int capacity) {
        if (capacity == 256 || capacity == 512 || capacity == 1024 || capacity == 2048) {
            this.SSD_Capacity = capacity;
        } else {
            System.out.println("set capacity only like this. 256; 512; 1024; 2048");
        }
    }

    public int getSSD_Capacity() {
        return SSD_Capacity;
    }
}

package Part3.Shopping;

public abstract class SamsungPhones extends AndroidPhone {

    public SamsungPhones(String type, int price, int costPrice) {
        super(type, price, costPrice);
    }

    public abstract void cameraInfo();

}

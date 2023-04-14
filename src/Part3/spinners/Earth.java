package Part3.spinners;

public class Earth implements SpinByAxis, SpinBySmthEllipse {

    @Override
    public boolean rotate() {
        System.out.print("Does Earth rotates...? ");
        return true;
    }


    @Override
    public boolean rotateBySmth() {
        System.out.print("Does Earth rotates around something...? ");
        return true;
    }


    @Override
    public void rotateByAxis() {
        System.out.println("Earth rotates around his axis");
    }


    @Override
    public void rotateElliptical() {
        System.out.println("Earth rotates ELLIPTICAL around Sun");
    }
}

package Part3.spinners;

public class Boomerang implements SpinByAxis, SpinBySmthEllipse {

    @Override
    public boolean rotate() {
        System.out.print("Does boomerang rotates...? ");
        return true;
    }
    @Override
    public boolean rotateBySmth() {
        System.out.print("Does boomerang rotates around something...? ");
        return true;
    }

    @Override
    public void rotateByAxis() {
        System.out.println("Boomerang rotates around his axis");
    }

    @Override
    public void rotateElliptical() {
        System.out.println("Boomerang rotates ELLIPTICAL around his orbit centre :)");
    }
}

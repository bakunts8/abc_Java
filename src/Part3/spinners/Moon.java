package Part3.spinners;


public class Moon implements SpinBySmthAllWays {

    @Override
    public boolean rotate() {
        System.out.print("Does Moon rotates...? ");
        return true;
    }

    @Override
    public boolean rotateBySmth() {
        System.out.print("Does Moon rotates around something....? ");
        return true;
    }

    @Override
    public void rotateCircular() {
        System.out.println("Moon rotates CIRCULAR around Earth");
    }

    @Override
    public void rotateElliptical() {
        System.out.println("In general plan Moon rotates ELLIPTICAL around Sun");
    }

    @Override
    public void rotateSpiral() {
        System.out.println("When viewed in detail the Moon orbit is SPIRAL around Sun");
    }
}

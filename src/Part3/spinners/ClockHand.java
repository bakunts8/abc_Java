package Part3.spinners;

public class ClockHand implements SpinByAxis {

    @Override
    public boolean rotate() {
        System.out.print("Does clock hands rotate...? ");
        return true;
    }

    @Override
    public void rotateByAxis() {
        System.out.println("Clock hands rotate around his axis");
    }
}

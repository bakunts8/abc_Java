package Part3.spinners;

public class Main {

    public static void main(String[] args) {

        Spinnable[] spinnable = {new Earth(), new Moon(), new ClockHand(), new Boomerang()};
        for (Spinnable spinner : spinnable) {
            System.out.println(spinner.rotate());
        }

        Earth earth = new Earth();
        System.out.println(earth.rotateBySmth());
        earth.rotateByAxis();
        earth.rotateElliptical();

        Moon moon = new Moon();
        System.out.println(moon.rotateBySmth());
        moon.rotateCircular();
        moon.rotateElliptical();
        moon.rotateSpiral();

        ClockHand clockHand = new ClockHand();
        clockHand.rotateByAxis();

        Boomerang boomerang = new Boomerang();
        System.out.println(boomerang.rotateBySmth());
        boomerang.rotateByAxis();
        boomerang.rotateElliptical();
    }
}

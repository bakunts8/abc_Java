package Part4.GenSumNum;

import java.util.ArrayList;

public class TestBox {

    public static void main(String[] args) throws Exception {
        Box<Integer> integerBox = new Box<>(12);
        Box<Double> doubleBox = new Box<>(12.8);

        System.out.println(Box.sum(integerBox, doubleBox));
    }
}

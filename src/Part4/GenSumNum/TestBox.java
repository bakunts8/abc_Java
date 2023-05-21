package Part4.GenSumNum;

public class TestBox {

    public static void main(String[] args) throws Exception {
        Box<Integer> integerBox = new Box<>(12);
        Box<Double> doubleBox = new Box<>(12.8);

        Box<String> stringBox = new Box<>("abc");

        System.out.println(Box.sum(integerBox, doubleBox));
        System.out.println(Box.sum(integerBox, stringBox));
    }
}

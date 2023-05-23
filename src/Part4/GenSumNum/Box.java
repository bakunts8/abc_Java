package Part4.GenSumNum;

public class Box<T> {

    public T type;

    public Box(T t) {
        type = t;
    }

    public static double sum(Box<? extends Number> b1, Box<? extends Number> b2) {
            return b1.type.doubleValue() + b2.type.doubleValue();
        }
}
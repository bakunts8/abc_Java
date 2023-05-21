package Part4.GenSumNum;

public class Box<T> {

    public T type;

    public Box(T t) {
        type = t;
    }

    public <T extends Number> T getType() {
        return (T) type;
    }

    public static double sum(Box b1, Box b2) {
            return b1.getType().doubleValue() + b2.getType().doubleValue();
        }
}
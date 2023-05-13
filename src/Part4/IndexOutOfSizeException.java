package Part4;

public class IndexOutOfSizeException extends RuntimeException {

    String message = "index out of bound from size of array";

    @Override
    public String toString() {
        return getClass() + ": " + message;
    }
}

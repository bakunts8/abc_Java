package Part4.DynArray;


public class DynamicArray<E> implements MyList<E> {

    private int size = 0;
    private Object[] array;

    public DynamicArray(int length) {
        array = new Object[length];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if (size % array.length == 0 && size != 0) {
            expansionOrContraction(2.0);
        }
        array[size] = element;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfSizeException();
        } else if (size % array.length == 0 && index >= size) {
            expansionOrContraction(2.0);
        }
        array[index] = element;
        if (index == size) {
            size++;
        }
    }

    @Override
    public void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfSizeException();
        }
        for (int i = index + 1; i < array.length; i++) {
            array[index] = array[i];
            if (array[i] == null || i >= size - 1) {
                array[i] = null;
                size--;
                if (array.length - size > size) {
                    expansionOrContraction(0.5);
                }
                return;
            }
            index++;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        int i = 0;
        String list = "[ ";
        for (Object ob : array) {
            i++;
            if (i == array.length) {
                list = list.concat(ob + " ");
                continue;
            }
            list = list.concat(ob + ", ");
        }
        return list.concat("]");
    }

    private void expansionOrContraction(double coefficient) {
        int arrayLength = (int) (array.length * coefficient);
        Object[] temporary = array;
        array = new Object[arrayLength];
        for (int i = 0; i < temporary.length; i++) {
            if (i == arrayLength) {
                break;
            }
            array[i] = temporary[i];
        }
    }
}

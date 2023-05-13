package Part4;

public interface MyList<E> {

//    <E> E[] toArray(E[] array);

    int size();

    void add(E element);

    void add(int index, E element);

    void remove(int index);

    boolean isEmpty();

    Object get(int index);
}


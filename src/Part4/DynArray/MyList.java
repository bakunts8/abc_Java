package Part4.DynArray;

public interface MyList<E> {

    int size();

    void add(E element);

    void add(int index, E element);

    void remove(int index);

    boolean isEmpty();

    Object get(int index);
}


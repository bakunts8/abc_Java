package Part4.Collections;

import java.util.*;

public class SortedCollection<E extends Comparable<E>> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        super.add(e);
        Collections.sort(this); // my addition
        return true;
    }

    @Override
    public void add(int i, E e) {
        super.add(i, e);
        Collections.sort(this); // my addition
    }


    public static void main(String[] args) {

        List<String> myCollection = new SortedCollection<>();

        myCollection.add("s");
        myCollection.add("f");
        myCollection.add("q");
        myCollection.add(1, "f");
        System.out.println(myCollection);
        System.out.println();

        myCollection.add("y");
        myCollection.add(4, "h");
        myCollection.add("e");
        myCollection.add(myCollection.size(), "k");
        System.out.println(myCollection);
        System.out.println();

        myCollection.add("a");
        myCollection.add(8, "k");
        myCollection.add("s");
        System.out.println(myCollection);
        System.out.println();

        myCollection.add("r");
        myCollection.add("t");
        myCollection.add("e");
        myCollection.add(myCollection.size(), "a");
        System.out.println(myCollection);
        System.out.println();

        myCollection.clear();
        System.out.println(myCollection);
    }
}

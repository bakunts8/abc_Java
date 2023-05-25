package Part4.MyFirstLists;

import java.util.*;

public class TestList {

    public static void main(String[] args) {
        // 1)
        String[] names1 = {"Aram", "Ani", "Vahe"};
        String[] names2 = {"Aram", "Vahe", "Ani"};
        List<String> myArrayList = new ArrayList<>(Arrays.asList(names1));
        List<String> myLinkedList = new LinkedList<>(Arrays.asList(names1));

        System.out.println(myArrayList.equals(myLinkedList));

        myLinkedList = new LinkedList<>(Arrays.asList(names2));

        System.out.println(myArrayList.equals(myLinkedList));
        System.out.println("*******************************");
        System.out.println();

        // 2)
        Integer[] numbers = {128, 8, 6, 3, 128, 128, 8, 128, 4, 200, 5, 8};
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(elements);

        for (int i = elements.size() - 1; i > 0; i--) {
            if (elements.get(i).equals(elements.get(0))) {
                elements.remove(i);
            }
        }
        elements.remove(0);
        System.out.println(elements);
        System.out.println("******************************");
        System.out.println();

        // 3)
        Integer[] intArray = {12, 45, 47, 65, 32, -89, 74, 14, 81};
        List<Integer> myList = new ArrayList<>(Arrays.asList(intArray));

        System.out.println(myList);
        System.out.println(untilNegative(myList));
        System.out.println();

        Object[] array = {"abc", 18.8, intArray, 'c', 78.1,  new TestList(), "ok", -24, 79, myArrayList, 45};
        List<Object> obList = new LinkedList<>(Arrays.asList(array));

        System.out.println(obList);
        System.out.println(untilNegative(obList));
    }

    static <T> List<T> untilNegative(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number && ((Number) list.get(i)).doubleValue() < 0) {
                    list.subList(i, list.size()).clear();
                    break;
            }
        }
        return list;
    }
}

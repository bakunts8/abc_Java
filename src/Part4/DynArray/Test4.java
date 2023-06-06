package Part4.DynArray;

public class Test4 {

    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>(12);

        for (int i = 0; i < 10; i++) {
            array.add(i * 2);
        }

        System.out.println(array);
        System.out.println(array.size());

        array.add(4, 23);
        System.out.println(array);
        System.out.println(array.size());

        array.remove(8);
        System.out.println(array);
        System.out.println(array.size());

        array.add(8,0);
        System.out.println(array);
        System.out.println(array.size());

        array.remove(5);
        System.out.println(array);
        System.out.println(array.size());
        array.add(25);
        array.add(45);

        System.out.println(array);
        System.out.println(array.size());

        DynamicArray<String> arr = new DynamicArray<>(5);

        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        arr.add("g");
        System.out.println(arr);
        System.out.println(arr.size());

        arr.remove(0);
        arr.remove(1);
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}

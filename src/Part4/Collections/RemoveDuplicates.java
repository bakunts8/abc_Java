package Part4.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Three", "Two", "Four", "Five", "One", "Four"};

        // as requirement: add, then filter
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(stringArrayList);

        stringArrayList = new ArrayList<>(new HashSet<>(stringArrayList));
        System.out.println(stringArrayList);

        // adding at once, without duplicates
        ArrayList<String> strArrList = new ArrayList<>(new HashSet<>(Arrays.asList(strings)));
        System.out.println(strArrList);
    }
}

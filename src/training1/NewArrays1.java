package training1;

public class NewArrays1 {
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 13, 12, 74, 8, 23, 6, 7};
        int[] arr2 = {21, 18, 2, 1, 32, 9, 31, 4, 3};
        int[] array = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1 && arr2[i] % 2 == 1) {
                array[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                array[i] = arr2[i];
            } else array[i] = 0;
            System.out.print(array[i] + " ");
        }
    }
}


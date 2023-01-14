public class TwoDimensionalArrays3 {
    public static void main(String[] args) {

        int[] array = {12, 13, 20, 10, 8, 6, 7, 3, 5, 12, 4, 5, 54, 15, 48};
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

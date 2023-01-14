public class TwoDimensionalArrays2 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8}
        };

        System.out.println("Print the longest array");

        int[] longest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].length < array[i].length) {
                longest = array[i];
            }
        }

        for (int x : longest) {
            System.out.print(x + " ");
        }
    }
}

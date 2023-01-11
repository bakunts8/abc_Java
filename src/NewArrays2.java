public class NewArrays2 {
    public static void main(String[] args) {

        int[] array = {5, -8, 45, -78, 23, -41, 12, -4, 31, -4, 11};
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] -= 2 * array[i];
                negativeCount++;
            }
            System.out.print(array[i] + " ");
        }
        int positiveCount = array.length - negativeCount;

        System.out.println();
        System.out.println("negative number changes................................ " + negativeCount);
        System.out.println("number of positive numbers in the initial state........ " + positiveCount);
    }
}


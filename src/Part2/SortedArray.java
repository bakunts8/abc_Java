package Part2;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = {5, 12, -23, -23, 12, 5, 5, 12, -23, 12, -23, 5, -23, 12};
        int checkIfBloc = 0;

        while (checkIfBloc == 0) {
            checkIfBloc++;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    checkIfBloc = 0;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

//        //  if we know for sure that there are exactly these numbers in the array
//
//        int[] numbers = {-23, 5, 12};
//        int[] array = {5, 12, -23, -23, 12, 5, 5, 12, -23, 12, -23, 5, -23, 12};
//        int[] increaseArray = new int[array.length];
//        int index = -1;
//
//        for (int num : numbers) {
//
//            for (int i : array) {
//                if (i == num) {
//                    index++;
//                    increaseArray[index] = num;
//                }
//            }
//        }
//
//        for (int sort : increaseArray) {
//            System.out.print(sort + " ");
//        }
    }
}

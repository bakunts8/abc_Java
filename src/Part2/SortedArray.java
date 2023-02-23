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
    }
}

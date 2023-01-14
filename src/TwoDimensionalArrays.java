import org.w3c.dom.ls.LSOutput;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 7, 6, 8, 4, 4},
                {11, 14, 17, 20, 50, 2},
                {4, 6, 2, 8, 5, 10}
        };

        System.out.println("Print first and last members");

        for (int i = 0; i < array.length; i++) {
            System.out.print("*  " + array[i][0] + " ");
            System.out.println(array[i][array[i].length - 1]);
        }
    }
}

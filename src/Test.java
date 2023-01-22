public class Test {
    public static void main(String[] args) {
        int[][] arr1 = {
                {10, 20, 30, 40, 50},
                {11, 22, 33, 44, 60},
                {12, 13, 14, 15, 70},
                {13, 14, 15, 21, 80},
                {14, 15, 35, 25, 90},
        };
        int[][] arr2 = new int[arr1.length][arr1.length];
        int y = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[j][arr1.length - y] = arr1[i][j];
            }
            y++;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
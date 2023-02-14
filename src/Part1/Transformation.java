package Part1;

public class Transformation {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 0, 1, 0, 1, 1};
        int x = 1;
        int y = 0;
        for (int i = 1; i <= array.length; i++) {
            for (int j = array.length - i; j > 0; j--) {
                if (array[i - 1] != 0) {
                    x *= 2;
                } else x = 0;
            }
            y += x;
            x = 1;
        }
        if (array.length % 8 == 0 && array[0] == 1) {
            y = 0;
            for (int i = 2; i <= array.length; i++) {
                for (int j = array.length - i; j > 0; j--) {
                    if (array[i - 1] != 0) {
                        x *= 2;
                    } else x = 0;
                }
                y += -x;
                x = 1;
            }
        }
        if (y < 0 && array[array.length - 1] == 0) {
            y = y + 1;
        } else if (array[array.length - 1] == 0) {
            y = y - 1;
        }
        System.out.println(y);
    }
}

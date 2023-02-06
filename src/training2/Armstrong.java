package training2;

public class Armstrong {
    public static void main(String[] args) {
        int x = 8208;
        System.out.println(isArm(x));
    }

    static boolean isArm(int n) {
        boolean isArmstrong = false;
        int a = 10;
        int sumOfSquareDigits = 0;
        for (int i = 0; i < numberLength(n); i++) {
            int digit = (n - n / a * a) / (a / 10);
            a *= 10;
            int square = 1;

            for (int j = 0; j < numberLength(n); j++) {
                square *= digit;
            }

            sumOfSquareDigits += square;
        }

        if (sumOfSquareDigits == n) {
            isArmstrong = true;
        }
        return isArmstrong;
    }
    static int numberLength(int n) {
        int length = 0;
        for (int i = 1; i < n; i *= 10) {
            length++;
        }
        return length;
    }
}

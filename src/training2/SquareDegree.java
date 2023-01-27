
package training2;

import java.util.Scanner;

public class SquareDegree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which number do you want to square?");
        int a = s.nextInt();
        System.out.println("How many degrees?");
        int b = s.nextInt();
        int summary = square(a, b);
        System.out.println("It is " + summary);
    }

    static int square(int a, int b) {

        if (a > 10 || a < -10 || b > 10 || b < -10) {
            return -1;
        } else if (a < 0) {
            return -2;
        }

        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}


package training2;

import java.util.Scanner;

public class SquareDegree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Which number do you want to square?");
        int a = s.nextInt();
        double summary;

        if (a == 0) {
            System.out.println("No sense, input again");
            a = s.nextInt();

            if (a == 0) {
                System.out.println("Always zero");
                System.exit(0);
            }
        }

        if (a == 1) {
            System.out.println("No sense, input again");
            a = s.nextInt();
            if (a == 1) {
                System.out.println("Always 1");
                System.exit(0);
            }
        }

        System.out.println("How many degrees?");
        int b = s.nextInt();
        summary = square(a, b);
        System.out.println(summary);
    }

    static int makePositive(int b) {
        if (b < 0) {
            return -1 * b;
        }
        return b;
    }

    static double square(int a, int b) {
        long result = a;

        for (int i = 1; i < makePositive(b); i++) {
            result *= a;
        }

        if (a > 10 || a < -10) {
            return -1;
        } else if (a < 0) {
            return -2;
        } else if (b > 10 || b < -10) {
            return -1;
        } else if (b == 0) {
            return 1;
        } else if (b < 0) {
            return (double) 1 / result;
        }

        return result;
    }
}

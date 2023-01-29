
package training2;

import java.util.Scanner;

public class SquareDegree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Which number do you want to square?");
        int a = s.nextInt();

        if (a == 0) {
            System.out.println("No sense, input again");
            a = s.nextInt();
            if (a == 0) {
                System.out.println("Always zero");
                System.exit(0);
            }
        }

        System.out.println("How many degrees?");
        int b = s.nextInt();

        double summary = square(a, b);
        System.out.printf("It is " + "%.10f\n", summary);
    }

    static double square(int a, int b) {

        if (a > 10 || a < -10 || b > 10 || b < -10) {
            return -1;
        } else if (a < 0) {
            return -2;
        } else if (b == 0) {
            return 1;
        } else if (b < 0) {
            int result = a;
            for (int i = b + 1; i < 0; i++) {
                result *= a;
            }
            return (double) 1 / result;
        }

        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}

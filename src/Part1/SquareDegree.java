
package Part1;

public class SquareDegree {
    public static void main(String[] args) {

        double summary = square(8, 4);
        if (summary == -1) {
            System.out.println("a or b greater");
        } else if(summary == -2) {
            System.out.println("a is negative");
        } else if(summary > 0 && summary < 1) {
            System.out.printf("%.10f\n", summary);
        } else System.out.printf("%.2f\n", summary);
    }

    static int makePositive(int n) {
        if (n < 0) {
            return -1 * n;
        }
        return n;
    }

    static double square(int a, int b) {
        long result = a;

        for (int i = 1; i < makePositive(b); i++) {
            result *= a;
        }

        if (makePositive(a) > 10 || makePositive(b) > 10) {
            return -1;
        } else if (a < 0) {
            return -2;
        } else if (b == 0) {
            return 1;
        } else if (b < 0) {
            return (double) 1 / result;
        }

        return result;
    }
}

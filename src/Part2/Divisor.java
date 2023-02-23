package Part2;

public class Divisor {

    public static void main(String[] args) {
        Divisor divisor = new Divisor();

        int[] numbers = {64, 32, 8, -16, 32, -64, 128, 256, 512, -1024};
        System.out.println("The Greatest Common Divisor is   " + divisor.GreatestCommonDivisor(numbers));
    }

    public int GreatestCommonDivisor(int[] numbers) {
        int divisor = 1;
        int min = numbers[0];

        // correct the array under these conditions
        for (int num : numbers) {

            if (num == 0) {
                System.out.println("Must not be zero in the array");
                System.exit(1);
            }
        }

        // finding minimum number
        for (int num : numbers) {

            if (num < 0) {
                num *= -1;
            }

            if (num < min) {
                min = num;
            }
        }

        // finding the greatest common divisor
        for (int i = 2; i <= min; i++) {
            int checker = 0;

            for (int num : numbers) {

                if (num % i == 0) {
                    checker++;

                    if (checker == numbers.length) {
                        divisor = i;
                        break;
                    }

                }
            }
        }

        return divisor;
    }
}


package Part1;

public class PrimeNumber {
    public static void main(String[] args) {

        int[] array = {8, 51, 20, 70, 30, 85, 13711};
        int q = 0;
        for (int i = 0, a = 0; i < array.length; i++) {
            for (int x = 2; x <= array[i] / 2; x++) {

                if (array[i] % x == 0) {
                    a++;
                    q++;
                    break;
                }
            }
            if (a == i) {
                a++;
                System.out.println(array[i]);
            }
        }
        if (q == array.length) {
            System.out.println("There is no prime number");
        }
    }
}


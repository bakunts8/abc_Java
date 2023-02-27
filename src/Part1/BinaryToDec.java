package Part1;

public class BinaryToDec {

    public static void main(String[] args) {

        int[] binary = {1, 0, 0, 0, 1};
        int dec = 0;
        int square = binary.length - 1;

        for (int i : binary) {
            dec += i * Math.pow(2, square);
            square--;
        }

        if (binary.length % 8 == 0 && binary[0] == 1) {
            dec -= Math.pow(2, binary.length - 1);
            dec *= -1;
        }

        System.out.println(dec);
    }
}

package Part2;

public class StringReverse {

    public static void main(String[] args) {
        String sentence = "setirw txet tahw rednow I ruoh eno ylraen";
        String reverse = "";

        char[] symbols = sentence.toCharArray();

        for (int i = symbols.length - 1; i >= 0; i--) {
            reverse = reverse + symbols[i];
        }

        System.out.println(reverse);
    }
}

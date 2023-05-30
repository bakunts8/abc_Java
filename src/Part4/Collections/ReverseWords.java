package Part4.Collections;

public class ReverseWords {

    public static void main(String[] args) {

        String text = "s'teL yrt ot esrever eht sdrow";
        String reverseText = reverseText(text);
        System.out.println(reverseText);
    }

    static String reverseText(String text) {

        String[] words = text.split(" ");
        StringBuilder textBuilder = new StringBuilder();

        for (String word : words) {
            char[] letters = word.toCharArray();

            for (int i = letters.length - 1; i >= 0; i--) {
                textBuilder.append(letters[i]);
            }
            textBuilder.append(" ");
        }

        text = textBuilder.toString();
        return text.substring(0, text.length() - 1);
    }
}

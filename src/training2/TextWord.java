package training2;
public class TextWord {
    public static void main(String[] args) {
        String text = "This Java tutorial covers basic to advanced concepts related to Java Programming: String";
        String word = "java";
        System.out.println(compare(text, word));   // Using compareTo
        System.out.println(checkString(text));     // Using equals

    }

    static int compare(String t, String w) {
        int count = 0;
        String[] str = t.split(" ");
        for (String s : str) {
            int value = s.compareToIgnoreCase(w);
            if (value == 0) {
                count++;
            }
        }
        if (w.isEmpty() || t.isEmpty()) {
            return -2;
        } else if (count == 0) {
            return -1;
        }
        return count;
    }

    static int checkString(String t) {
        int count = 0;
        String word = "string";
        String[] str = t.split(" ");
        for (String s : str) {
            boolean value = s.equalsIgnoreCase(word);
            if (value) {
                count++;
            }
        }
        if (t.isEmpty() || word.isEmpty()) {
            return -2;
        } else if (count == 0) {
            return -1;
        }
        return count;
    }

}

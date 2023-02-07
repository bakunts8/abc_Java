package training2;
public class TextWord {
    public static void main(String[] args) {
        String text = "This Java tutorial covers basic to advanced concepts related to Java Programming: String";
        String word = "java";
        System.out.println(compare(text, word));
        System.out.println(compare(text));
    }

    static int transfer(String t, String w) {
        int count = 0;
        String[] str = t.split(" ");
        for (String s : str) {
            int value = s.compareToIgnoreCase(w);
            if (value == 0) {
                count++;
            }
        }
        if (t.isEmpty() || w.isEmpty()) {
            return -2;
        } else if (count == 0) {
            return -1;
        }
        return count;
    }

    static int compare(String t, String w) {
        return transfer(t, w);
    }

    static int compare(String t) {
        String word = "string";
        return transfer(t, word);
    }
}


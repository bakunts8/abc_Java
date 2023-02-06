package training2;
public class TextWord {
    public static void main(String[] args) {
        String text = "This Java tutorial covers basic to advanced concepts related to Java Programming";
        String word = "java";
        int count = compare(text,word);
        System.out.println(count);
    }
    static int compare(String t, String w) {
        int count = 0;
        String t1 = t.toLowerCase();
        String w1 = w.toLowerCase();
        String[] str = t1.split(" ");
        for (String s : str) {
            boolean value = s.contains(w1);
            if (value) {
                count++;
            }
        }
        if (w1.isEmpty()) {
            return -2;
        } else if (count == 0) {
            return -1;
        }
        return count;
    }

    //Example two.................

//    static int compare(String t, String w) {
//        int count = 0;
//        String[] str = t.split(" ");
//        for (String s : str) {
//            int value = s.compareToIgnoreCase(w);
//            if (value == 0) {
//                count++;
//            }
//        }
//        if (w.isEmpty()) {
//            return -2;
//        } else if (count == 0) {
//            return -1;
//        }
//        return count;
//    }
}

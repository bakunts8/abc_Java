package Part2;

public class Ascii2 {
    public static void main(String[] args) {
        char[] charArr = {'q', 'w', 'e', 'r', 't', 'y'};
        int[] intArr = charToInt(charArr);
        System.out.println();
        char[] newArray = intToChar(intArr);
        for (char c : newArray) {
            System.out.print(c + "   ");
        }
    }

    static int[] charToInt(char[] a) {
        int[] array = new int[a.length];
        func(array, a);
        return array;
    }

    static char[] intToChar(int[] a) {
        char[] array = new char[a.length];
        func(a, array);
        return array;
    }

    static void func(int[] i, char[] c) {
        for (int x = 0; x < i.length; x++) {
            if (c[x] != 0) {
                i[x] = c[x];
                System.out.print(i[x] + " ");
            } else c[x] = (char) i[x];
        }
    }
}


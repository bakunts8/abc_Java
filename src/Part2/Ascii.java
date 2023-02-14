package Part2;

public class Ascii {
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
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static char[] intToChar(int[] a) {
        char[] array = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = (char) a[i];
        }
        return array;
    }
}


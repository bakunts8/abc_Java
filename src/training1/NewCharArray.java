package training1;

import java.util.Scanner;

public class NewCharArray {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'q', 'w', 'e', 'r', 't', 'y', 'x', 'h', 'k', 'l', 'o'};
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        int a = 0;

        while (letter != array[a] && a < array.length - 1) {
            a++;
            if (letter == array[a]) {
                System.out.println("The letter _" + letter + "_ in the _" + a + "_ index of array");
                continue;
            }
        }
        if (letter != array[a]) {
            System.out.println("The _" + letter + "_ letter was not found");
        }
    }
}



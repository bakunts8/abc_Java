package Part1;

public class Main {
    public static void main(String[] args) {
        int c;
        int a = 8;
        int b = 12;
        c = a * a + b * b;
        System.out.println("c = " + c);

        // Table bases and height data are given. Find the area.
        a = 18;
        b = 14;
        c = 10; //height
        System.out.println("the area of the table is equal " + (a + b) / 2 * c);

        //print the digits of a three-digit number
        int x = 824;
        System.out.println(x / 100);
        System.out.println((x % 100) / 10);
        System.out.println(x % 10);
    }
}
import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("input index of minute between 1-12");

        if (x > 0 && x < 13) {
            System.out.println("It is " + (x * 5) + " minute");
        } else {
            System.out.println("input between 1-12");
            x = sc.nextInt();
            if (x > 0 && x < 13) {
                System.out.println("It is " + (x * 5) + " minute");
            } else {
                System.out.println("error");
            }
        }
    }
}


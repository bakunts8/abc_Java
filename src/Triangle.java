import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Whether a triangle will be drawn with the data you entered");

        System.out.println("input first side");
        int a = data.nextInt();
        if (a <= 0) {
            System.out.println("invalid data, input again");
            a = data.nextInt();
            if (a <= 0) {
                System.exit(0);
            }
        }

        System.out.println("input second side");
        int b = data.nextInt();
        if (b <= 0) {
            System.out.println("invalid data, input again");
            b = data.nextInt();
            if (b <= 0) {
                System.exit(0);
            }
        }

        System.out.println("input third side");
        int c = data.nextInt();
        if (c <= 0) {
            System.out.println("invalid data, input again");
            c = data.nextInt();
            if (c <= 0) {
                System.exit(0);
            }
        }
        if (c < a + b) {
            System.out.println("Yes it is possible");
        } else
            System.out.println("No, that's not possible");
    }
}

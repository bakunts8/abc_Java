package training1;

import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        System.out.println("Enter the month number and find out the number of days in that month");
        System.out.println("input must be in the range 1 to 12 inclusive");
        int i;
        int x;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i > 12 || i <= 0) {
            System.out.println("invalid data");
            System.exit(0);
        }

        switch (i) {
            case 1, 3, 5, 7, 8, 10, 12:
                x = 31;

                System.out.println(i + " ---this month has " + x + " days");

            case 2:
                x = 28;
                System.out.println(i + " ---this month has " + x + " or 29 days");


            case 4, 6, 9, 11:
                x = 30;
                System.out.println(i + " ---this month has " + x + " days");
        }
    }
}




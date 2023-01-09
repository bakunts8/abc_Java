import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        double[] giver = {-5, -14.15, 5.8, -1, 10.3};
        double[] taker = new double[5];
        int x = 0;
        int y = 0;

        if (giver[x] >= 0) {
            taker[y] = giver[x];
            x++;
            y++;
        } else x++;

        if (giver[x] >= 0) {
            taker[y] = giver[x];
            x++;
            y++;
        } else x++;

        if (giver[x] >= 0) {
            taker[y] = giver[x];
            x++;
            y++;
        } else x++;

        if (giver[x] >= 0) {
            taker[y] = giver[x];
            x++;
        } else x++;

        if (giver[x] >= 0) {
            taker[y] = giver[x];
            x++;
        } else x++;

        System.out.println(taker[0]);
        System.out.println(taker[1]);
        System.out.println(taker[2]);
        System.out.println(taker[3]);
        System.out.println(taker[4]);

    }
}

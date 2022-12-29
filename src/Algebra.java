public class Algebra {
    public static void main(String[] args) {
        int x = 17;
        int y = 5;
        boolean bool = false;

        int quantity1 = x / y;
        float quantity2 = (float) x / y;

        if (quantity1 == quantity2) {
            bool = true;
        }

        System.out.println(bool);

        //next task

        int a, b, c, d, e, f;
        a = 8;
        b = 14;
        c = 78;
        d = 23;
        e = 62;
        f = 51;

        float first = (float) (a + b + c) / 3;
        float second = (float) (d + e + f) / 3;

        System.out.println(first);
        System.out.println(second);

        float sum_f = first + second;
        int sum = (int) sum_f;

        System.out.println(sum_f);
        System.out.println(sum);

    }
}

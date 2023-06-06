package Part4.MonitorAndTriangle.Triangle;

import java.util.LinkedHashMap;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(new int[][]{{1, 2}, {-1, 26}, {3, 8}});
        Triangle t2 = new Triangle(new int[][]{{1, 4}, {5, 2}, {-3, 14}});
        Triangle t3 = new Triangle(new int[][]{{4, 2}, {-18, 6}, {5, 1}});
        Triangle t4 = new Triangle(new int[][]{{3, -2}, {19, 8}, {3, 6}});
        Triangle t5 = new Triangle(new int[][]{{-5, 2}, {5, 8}, {3, -4}});
        Triangle t6 = new Triangle(new int[][]{{3, -7}, {5, 8}, {11, 4}});
        Triangle t7 = new Triangle(new int[][]{{13, 2}, {-9, 8}, {3, 6}});
        Triangle t8 = new Triangle(new int[][]{{-5, 3}, {4, -8}, {3, 4}});
        Triangle t9 = new Triangle(new int[][]{{3, 2}, {-5, 8}, {13, 4}});

        LinkedHashMap<Triangle, Color> linked = new LinkedHashMap<>();

        linked.put(t1, Color.BLACK);
        linked.put(t2, Color.WHITE);
        linked.put(t3, Color.BLUE);
        linked.put(t4, Color.YELLOW);
        linked.put(t5, Color.GREEN);
        linked.put(t6, Color.BLUE);
        linked.put(t7, Color.RED);
        linked.put(t8, Color.ORANGE);
        linked.put(t9, Color.PINK);

        System.out.println(linked.get(t3));
        System.out.println(linked.get(t4));
        System.out.println(linked.get(t1));

        System.out.println();
        System.out.println(linked);
    }
}

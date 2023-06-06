package Part4.MonitorAndTriangle.Triangle;

public class Triangle {

    private int[][] coordinates;


    Triangle(int[][] c) {
        setCoordinates(c);
    }


    private void setCoordinates(int[][] c) {
        checkPoints(c);
        this.coordinates = c;
    }


    private void checkPoints(int[][] coordinates) {
        // the three points on one line case is not calculated
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                if (coordinates.length != 3 || coordinates[i].length != 2) {
                    throw new IllegalArgumentException("The points is not enough or more than required");
                }
            }
        }
        int[] a = coordinates[0];
        int[] b = coordinates[1];
        int[] c = coordinates[2];

        if (a[0] == b[0] && a[1] == b[1] || b[0] == c[0] && b[1] == c[1] || a[0] == c[0] && a[1] == c[1]) {
            throw new IllegalArgumentException("The some points of triangle are same");
        }
    }


    public int[][] getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return "Triangle:";
    }
}

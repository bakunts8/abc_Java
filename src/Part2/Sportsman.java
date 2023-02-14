package Part2;

class Sportsman {
    String name;
    private int sumOfPoints;
    double averagePoints;

    Sportsman(String n, int... c) {
        name = n;
        for (int point : c) {
            sumOfPoints += point;
        }
        averagePoints = (double) sumOfPoints / c.length;
    }

    static double averagePoints(Sportsman s) {
        return s.averagePoints;
    }

    public static void main(String[] args) {

        Sportsman[] men = {
                new Sportsman("Lewis", 75, 80, 92, 55, 100),
                new Sportsman("Jordan", 79, 87, 95),
                new Sportsman("Federer", 73, 90)
        };

        for (Sportsman s : men) {
            System.out.println("Average points of " + s.name + " is equals " + averagePoints(s));
        }
    }
}

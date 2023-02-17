package Part2;

public class Sport {
    private String name;
    private int[] Points;

    Sport(String n, int... p) {
        name = n;
        Points = p;
    }

    double averagePoints(Sport s) {
        double sumOfPoints = 0;
        for (int point : s.Points) {
            if (point < 50 || point > 100) {
                return 0;       // to continue for others, is checked in main
            }
            sumOfPoints += point;
        }
        return sumOfPoints / s.Points.length;
    }

    int compare(Sport s1, Sport s2) {
        if (averagePoints(s1) - averagePoints(s2) > 0) {
            return 1;
        } else if (averagePoints(s1) - averagePoints(s2) < 0) {
            return -1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}

class Sportsman {
    public static void main(String[] args) {

        Sport[] men = {
                new Sport("Lewis", 75, 4512394, 92, 55, 100),
                new Sport("Jordan", 79, 87, 95),
                new Sport("Federer", 73, 94238241),
                new Sport("Зубастик", 85, 94, 88, 72, 64, 85, 91, 100)
        };

        for (Sport man : men) {
            if (man.averagePoints(man) == 0) {      // to continue for others
                System.out.println("Run again and input parameters 'p' (points) for " + man.getName() + " between 50 - 100");
                continue;
            }
            System.out.println(man.getName() + "----" + man.averagePoints(man));
        }
        System.out.println();
        System.out.println("Sportsmen compare code is " + men[0].compare(men[1], men[2]));
    }
}



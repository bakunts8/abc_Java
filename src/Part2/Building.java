package Part2;

public class Building {
    private String type;
    private int floors;
    private int twoRooms;
    private int threeRooms;

    Building(String type, int floors) {
        this.type = type;
        this.floors = floors;
    }

    int sumBuildingRooms(Building b) {
        // so that the types and floors differ in some way in the number of apartments
        if (b.type.equals("Panel building")) {
            twoRooms = floors * 4;
            threeRooms = floors * 2;
            return twoRooms + threeRooms;
        }
        twoRooms = floors * 5;
        threeRooms = floors * 3;
        return twoRooms + threeRooms;
    }
}

class District {

    private int[] gardenArea = {10000, 12000, 14000};

    Building[][] Districts = {
            {
                    new Building("Panel building", 10),
                    new Building("Monolithic building", 12),
                    new Building("Monolithic building", 16),
            },
            {
                    new Building("Panel building", 9),
                    new Building("Panel building", 7),
                    new Building("Monolithic building", 8),
                    new Building("Monolithic building", 6),
                    new Building("Monolithic building", 8)
            },
            {
                    new Building("Panel building", 10),
                    new Building("Panel building", 5),
                    new Building("Panel building", 11),
                    new Building("Monolithic building", 12),
                    new Building("Monolithic building", 7),
                    new Building("Monolithic building", 5),
                    new Building("Monolithic building", 14)
            }
    };

    int sumDistrictRooms(int i) {
        int sum = 0;
        for (int j = 0; j < Districts[i].length; j++) {
            sum += Districts[i][j].sumBuildingRooms(Districts[i][j]);
        }
        return sum;
    }

    public static void main(String[] args) {

        District d = new District();

        for (int i = 0; i < d.gardenArea.length; i++) {
            System.out.println("District " + (i + 1) + " --- " + d.gardenArea[i] / d.sumDistrictRooms(i));
        }
    }
}


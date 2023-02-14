package Part2;

class City {
    String name = "Not defined";
    int population;
    boolean isCapital;
    String country;

    City(int p, boolean is, String c) {
        population = p;
        isCapital = is;
        country = c;
    }

    City(String n, int p, boolean is, String c) {
        name = n;
        population = p;
        isCapital = is;
        country = c;
    }

    public static void main(String[] args) {
        City city = new City(36000000, true, "Japan");

        if (city.name.equals("Not defined")) {
            city.name = "Tokyo";
        }

        System.out.print("THIS IS " + city.name);
        System.out.print(", IT HAS A POPULATION OF " + city.population);
        System.out.print(" AND " + city.isCapital);
        System.out.print(" THAT IT IS THE CAPITAL OF " + city.country);
        System.out.println();
    }
}

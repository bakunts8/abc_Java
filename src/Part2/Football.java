package Part2;

public class Football {
    private static final String[] names = {"Iker", "Michel", "Francisko", "Roberto", "Raul", "Luis", "Xose", "David", "Zinedine", "Gonzales", "Luis"};
    private static final String[] lastNames = {"Casillas", "Salgado", "Pavon", "Carlos", "Bravo", "Figo", "Guti", "Beckham", "Zidane", "Raul", "Ronaldo"};
    private static final String[] positions = {"Goalkeeper", "Defender", "Defender", "Defender", "Defender", "Midfield", "Midfield", "Midfield", "Midfield", "Striker", "Striker"};
    private static final String[] nationalities = {"Spain", "Spain", "Spain", "Brazil", "Spain", "Portugal", "Spain", "England", "France", "Spain", "Brazil"};
    private final String name;
    private final String lastName;
    private final String position;
    private final String nationality;

    public Football(String name, String lastname, String position, String nationality) {
        this.name = name;
        this.lastName = lastname;
        this.position = position;
        this.nationality = nationality;
    }

    public static Football[] createPlayer() {
        Football[] n = new Football[11];

        for (int i = 0; i < 11; i++) {
            n[i] = new Football(names[i], lastNames[i], positions[i], nationalities[i]);
        }

        return n;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    static String info(Football player) {
        return   player.getName() +" "+ player.lastName +" "+ player.getPosition() +" "+ player.getNationality();
    }
}

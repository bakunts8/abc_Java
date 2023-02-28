package Part2;

public class MainFootball {

    public static void main(String[] args) {
        // Create all players, 0-10
        Football[] n = Football.createPlayer();

        System.out.println(n[10].getName());
        System.out.println(n[10].getLastName());
        System.out.println(n[10].getPosition());
        System.out.println(n[10].getNationality());
        System.out.println(".........................");

        // Or...

        System.out.println(Football.info(n[10]));
    }
}

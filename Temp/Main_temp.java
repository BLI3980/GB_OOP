import java.util.Random;
import java.util.UUID;

public class Main_temp {
    public static void main(String[] args) {
        String team1 = "team1", team2 = "team2", team3 = "team3", team4 = "team4";

        int choice1 = new Random().nextInt(2);
        int choice2 = new Random().nextInt(2);

        String winner1 = choice1 == 0 ? team1 : team2;
        System.out.printf("choice1 is: %d; winner1 is %s", choice1, winner1);
        System.out.println();

        String winner2 = "";
        if (choice2 == 0) { winner2 = team3; }
        else { winner2 = team4; }
        System.out.printf("choice2 is: %d; winner2 is %s", choice2, winner2);

        System.out.println();
        String tName = UUID.randomUUID().toString().substring(0,10);
        System.out.println(tName);
    }
}

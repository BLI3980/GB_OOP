import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main_temp {
    public static void main(String[] args) throws IOException {
//        String team1 = "team1", team2 = "team2", team3 = "team3", team4 = "team4";
//
//        int choice1 = new Random().nextInt(2);
//        int choice2 = new Random().nextInt(2);
//
//        String winner1 = choice1 == 0 ? team1 : team2;
//        System.out.printf("choice1 is: %d; winner1 is %s", choice1, winner1);
//        System.out.println();
//
//        String winner2 = "";
//        if (choice2 == 0) { winner2 = team3; }
//        else { winner2 = team4; }
//        System.out.printf("choice2 is: %d; winner2 is %s", choice2, winner2);
//
//        System.out.println();
//        String tName = UUID.randomUUID().toString().substring(0,10);
//        System.out.println(tName);


//        Path file = Path.of("c:\\_GB\\testFile1.txt");
//        Path file = Path.of("testFile1.txt").getParent();
//        System.out.println(Path.of("testFile1.txt").getParent());

//        Files.createFile(Path.of("testFile1.txt"));

//        Path path = Path.of("users.txt");
//        List<String > list = Files.readAllLines(path);
//        for (String str: list) {
//            System.out.println(str);
//        }

//        Path path = Path.of("C:\\_GB\\6_OOP");
//        try(DirectoryStream<Path> dir = Files.newDirectoryStream(path)) {
//            for (Path pathTo: dir) {
//                System.out.println(pathTo);
//            }
//        }

        Path original = Path.of("users1.txt");
        Path temp = Path.of("temp.txt");
        String toRemove = "3,TestFirstName3,TestLastName3,TestPhoneNum3";

        BufferedWriter writer = Files.newBufferedWriter(temp);

        List<String> linesOfOriginal = Files.readAllLines(original);

        for (String line : linesOfOriginal) {
            if (line.equals(toRemove)) {
                continue;
            }
            writer.write(line);
            writer.append('\n');
        }
        writer.close();

        List<String> linesOfTemp = Files.readAllLines(temp);
        System.out.println(linesOfOriginal);
        System.out.println();
        System.out.println(linesOfTemp);

        File original1 = new File("users1.txt");
        File temp1 = new File("temp.txt");
        original1.delete();
        temp1.renameTo(original1);

    }
}

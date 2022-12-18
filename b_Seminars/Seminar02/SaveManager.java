import java.util.List;
import java.io.*;

public class SaveManager {

    public void saveToFile(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("file.txt", false)){
            for (Animal item: animals) {
                writer.write(item.toString()+"\n");
            }
//            writer.append('\n');
            writer.flush();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

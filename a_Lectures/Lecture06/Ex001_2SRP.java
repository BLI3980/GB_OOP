import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_2SRP {
    public static void main(String[] args) {

        Planner3SRP planner = new Planner3SRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        DataManager dm = new DataManager();
        dm.saveAllText(planner, "c:\\безысходность\\srp.txt");

    }
}

class PlannerSRP {
    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }    
}


class DataManager {
    private boolean check(String filenameOfConnect){
        return true;
    }

    public void saveAllText(Planner3SRP planner, String path) {
        /// ошибки связанные с...
        if(check(path));///
    }
    
    public void loadFromFile(Planner3SRP planner, String path) {
        /// ошибки связанные с...
        if(check(path));///
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
        if(check(url));///
    }    
}
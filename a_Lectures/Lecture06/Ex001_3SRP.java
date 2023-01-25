import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_3SRP {
    public static void main(String[] args) {

        Planner3SRP planner = new Planner3SRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        DataManager3SRP dm = new FileManager();
        dm.save(planner, "c:\\безысходность\\srp.txt");

    }
}

class Planner3SRP {
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


class DataManager3SRP {
    void save(Planner3SRP planner, String path){

    };
    public boolean check(String filename) {
        return true;
    };
}

class   FileManager extends DataManager3SRP {
//    private boolean check(String filename) {
//        return true;
//    }

    private void saveAllText(Planner3SRP planner, String path) {
        /// ошибки связанные с...
        if (check(path)) ;///
    }

//    private void save(Planner3SRP planner, String path) {
//        this.saveAllText(planner, path);
//    };
}

class DbManager extends DataManager3SRP {

    public void saveDb(Planner3SRP planner, String url, String username, String password) {
        /// ошибки связанные с ...
        if (check(url)) ; ///
        save(planner, new ConnectProvider(url, username, password).getPath());
    }

}

class ConnectProvider {
    String url;
    String username;
    String password;

    public ConnectProvider(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getPath() {
        return "...";
    }

}

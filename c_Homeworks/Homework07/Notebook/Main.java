package Notebook;

import Notebook.controllers.Controller;
import Notebook.model.*;
import Notebook.views.View;

import static Notebook.Config.dbFile;

public class Main {
    public static void main(String[] args) throws Exception {

        DatabaseRead dbReadFile = new DBReadFile(dbFile);
        Notes notes = new NotesOps(dbReadFile);
        Controller controller1 = new Controller(notes);
        View view1 = new View(controller1);
        view1.run();
    }
}

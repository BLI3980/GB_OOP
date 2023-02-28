package Notebook;

import Notebook.controllers.Controller;
import Notebook.controllers.UserController;
import Notebook.model.*;
import Notebook.views.View;
import Notebook.views.ViewUser;

import static Notebook.Config.dbFile;
import static Notebook.Config.filename;

public class Main {
    public static void main(String[] args) throws Exception {
//        FileOperation fileOperation = new FileOperationImpl(filename);
//        Repository repository = new RepositoryFile(fileOperation);
//        UserController controller = new UserController(repository);
//        ViewUser view = new ViewUser(controller);
//        view.run();

        DatabaseRead dbReadFile = new DBReadFile(dbFile);
//        DatabaseSave dbSaveFile = new DBSaveFile(dbFile);
        Notes notes = new NotesOps(dbReadFile);
        Controller controller1 = new Controller(notes);
        View view1 = new View(controller1);
        view1.run();
    }
}

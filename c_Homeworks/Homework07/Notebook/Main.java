package Notebook;

import Notebook.controllers.UserController;
import Notebook.model.FileOperation;
import Notebook.model.FileOperationImpl;
import Notebook.model.Repository;
import Notebook.model.RepositoryFile;
import Notebook.views.ViewUser;
import static Notebook.Config.filename;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl(filename);
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

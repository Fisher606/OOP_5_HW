import Controllers.UserController;
import Model.FileOperation;
import Model.FileOperationImpl;
import Model.Repository;
import Model.RepositoryFile;
import Views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
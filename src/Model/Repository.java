package Model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
}
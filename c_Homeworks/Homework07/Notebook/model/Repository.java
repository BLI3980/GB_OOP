package Notebook.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String createUser(User user);
    void updateUserDetails(User user);
    void deleteUser(String id);
}

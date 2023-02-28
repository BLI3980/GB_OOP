package Notebook.controllers;

import Notebook.model.Repository;
import Notebook.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public List<User> readAllUsers() {
        List<User> result = repository.getAllUsers();
        return result;
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public void updateUser(String userId, User userUpdated) throws Exception {
        userUpdated.setId(userId);
        validateId(userUpdated);
        repository.updateUserDetails(userUpdated);
    }

    public void saveUser(User user) throws Exception {
        validateUser(user);
        repository.createUser(user);
    }

    public void deleteUser(String deleteUserId) {
        repository.deleteUser(deleteUserId);

    }





    private void validateUser(User user) throws Exception{
        if (user.getFirstName().contains(" ")){
            throw new Exception("First name contains unacceptable characters.");
        }
        if (user.getLastName().contains(" ")){
            throw new Exception("Last name contains unacceptable characters.");
        }
    }

    private void validateId (User user) throws Exception {
        if (user.getId().isBlank()){
            throw new Exception("ID cannot be empty");
        }
        validateUser(user);
    }

    public void checkIfIdExists(String inputId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user: users) {
            if (user.getId().equals(inputId)) {
                return;
            }
        }
        throw new Exception("No such ID exists. ");
    }
}

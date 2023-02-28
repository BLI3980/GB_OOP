package Notebook.views;

import Notebook.controllers.UserController;
import Notebook.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("\nChoose the action from the list below:\n" +
                    "1. Create new note\n" +
                    "2. Show the entire a notebook.\n" +
                    "3. Read a certain note.\n" +
                    "4. Edit an existing note.\n" +
                    "5. Delete a note from the notebook.\n" +
                    "6. Exit the notebook.\n" +
                    "Type your choice here: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;

            try {
                switch (com) {
                    case CREATE:
                        String firstName = prompt("Имя: ");
                        String lastName = prompt("Фамилия: ");
                        String phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> lst = userController.readAllUsers();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String idToChange = prompt("Введите ID пользователя для изменений: ");
                        userController.checkIfIdExists(idToChange);
                        userController.updateUser(idToChange, userDetails());
                        break;
                    case DELETE:
                        String idToDelete = prompt("Введите ID пользователя для удаления: ");
                        userController.checkIfIdExists(idToDelete);
                        userController.deleteUser(idToDelete);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User userDetails() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        User newUser = new User(firstName, lastName, phone);
        return newUser;
    }
}

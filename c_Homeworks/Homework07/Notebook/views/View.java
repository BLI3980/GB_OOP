package Notebook.views;

import Notebook.controllers.Controller;
import Notebook.model.Record;
import Notebook.model.RecordBasic;
import Notebook.model.User;

import java.util.List;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run(){

        while (true) {
            String command = prompt("\nChoose the action from the list below:\n" +
                    "1. Create new note\n" +
                    "2. Show the entire a notebook.\n" +
                    "3. Read a certain note.\n" +
                    "4. Edit an existing note.\n" +
                    "5. Delete a note from the notebook.\n" +
                    "6. Exit the notebook.\n" +
                    "Type your choice here: ");
            if (command.equals("6")) return;

            try {
                switch (command) {
                    case "1":
                        String header = prompt("Write short description of new note: ");
                        String noteText = prompt("Write a text of the note itself: ");
                        controller.saveNote(new RecordBasic(header,noteText));
                        break;
                    case "2":
                        System.out.println("\n==========================");
                        List<Record> notes = controller.readAllNotes();
                        for (Record note: notes) {
                            System.out.println(note);
                        }
                        System.out.println("\n==========================");
                        break;
                    case "3":
                        String id = prompt("Enter id of note: ");
                        Record record = controller.readNote(id);
//                        User user = controller.readUser(id);
                        System.out.println("\n==========================" +
                                "\n" + record +"\n" +
                                "==========================");
                        break;
                    case "4":
//                        String idToChange = prompt("Введите ID пользователя для изменений: ");
//                        controller.checkIfIdExists(idToChange);
//                        controller.updateUser(idToChange, userDetails());
//                        break;
                    case "5":
//                        String idToDelete = prompt("Введите ID пользователя для удаления: ");
//                        controller.checkIfIdExists(idToDelete);
//                        controller.deleteUser(idToDelete);
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

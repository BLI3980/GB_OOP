package Solid2Srp2.src.solid.srp.models;

import java.util.Scanner;

public class InputManager {

    public Order inputFromConsole(){
        Order order = new Order(prompt("Client name: "),prompt("Product: "),
                Integer.parseInt(prompt("Quantity: ")),Integer.parseInt(prompt("Price: ")));
//        clientName = prompt("Client name: ");
//        product = prompt("Product: ");
//        qnt = Integer.parseInt(prompt("Quantity: "));
//        price = Integer.parseInt(prompt("Price: "));
        return order;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

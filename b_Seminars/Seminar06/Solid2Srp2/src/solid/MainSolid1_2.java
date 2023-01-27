package Solid2Srp2.src.solid;

import Solid2Srp2.src.solid.srp.models.Order;

public class MainSolid1_2 {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}

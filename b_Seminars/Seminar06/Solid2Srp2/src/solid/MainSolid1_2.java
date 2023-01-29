package Solid2Srp2.src.solid;

import Solid2Srp2.src.solid.srp.models.InputManager;
import Solid2Srp2.src.solid.srp.models.Order;
import Solid2Srp2.src.solid.srp.models.SaveManager;

public class MainSolid1_2 {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
//        Order order = new Order("", "", 0, 0);
        InputManager input = new InputManager();
        Order order1 = input.inputFromConsole();
//        order.inputFromConsole();
        SaveManager saveJson = new SaveManager();
        saveJson.saveToJson(order1);
    }
}

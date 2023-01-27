package Solid5Lsp2.src.solid;

import Solid5Lsp2.src.solid.lsp.FactoryOrder;
import Solid5Lsp2.src.solid.lsp.Order;

public class MainSolid3_2 {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Order order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}

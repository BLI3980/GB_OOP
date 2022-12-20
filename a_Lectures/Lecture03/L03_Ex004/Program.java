package L03_Ex004;

import Ex004.ExBeverage.*;
import L03_Ex004.ExBeverage.Coffee;
import L03_Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}

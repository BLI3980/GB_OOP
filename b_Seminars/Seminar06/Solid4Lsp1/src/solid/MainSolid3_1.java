package Solid4Lsp1.src.solid;

import Solid4Lsp1.src.solid.lsp.Rectangle;
import Solid4Lsp1.src.solid.lsp.Square;

public class MainSolid3_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
//        rectangle.setSideA(4);
//        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}

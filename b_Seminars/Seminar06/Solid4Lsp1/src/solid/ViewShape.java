package Solid4Lsp1.src.solid;

import Solid4Lsp1.src.solid.lsp.Quadrilateral;
import Solid4Lsp1.src.solid.lsp.Rectangle;

public class ViewShape {
//    private Rectangle rectangle;
    private Quadrilateral quad;

    public ViewShape(Quadrilateral quad) {
        this.quad = quad;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна: ");
        System.out.println(quad.getArea());
    }
}

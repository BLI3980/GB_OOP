package Solid1Srp1.src.solid;

import Solid1Srp1.src.solid.srp.Point;
import Solid1Srp1.src.solid.srp.Square;
import Solid1Srp1.src.solid.srp.SquareArea;
import Solid1Srp1.src.solid.srp.SquareDraw;

public class MainSolid1_1 {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        SquareArea squareArea = new SquareArea(square);
        System.out.printf("Площадь фигуры: %d \n", squareArea.area() /*square.getArea()*/);
        SquareDraw squareDraw = new SquareDraw(square);
        squareDraw.draw();
    }
}

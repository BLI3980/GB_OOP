package Solid3Ocp1.src.solid;

import Solid3Ocp1.src.solid.ocp.RightTriangle;
import Solid3Ocp1.src.solid.ocp.Shape;
import Solid3Ocp1.src.solid.ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class MainSolid2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}

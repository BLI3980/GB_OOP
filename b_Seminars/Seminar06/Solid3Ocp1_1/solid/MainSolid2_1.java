package Solid3Ocp1_1.solid;

import Solid3Ocp1_1.solid.ocp.Area;
import Solid3Ocp1_1.solid.ocp.RightTriangle;
import Solid3Ocp1_1.solid.ocp.Shape;
import Solid3Ocp1_1.solid.ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class MainSolid2_1 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 4));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            //Modifying this loop
            sumArea += ((Area)shape).area();
//            if (shape instanceof RightTriangle) {
//                RightTriangle triangle = (RightTriangle) shape;
//                sumArea += triangle.getLeg1() * triangle.getLeg2() / 2.0;
//            }
//            if (shape instanceof Square) {
//                Square square = (Square) shape;
//                sumArea += Math.pow(square.getSide(), 2);
//            }
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}

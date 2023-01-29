package Solid3Ocp1_1.solid.ocp;

public class Square  implements Shape, Area {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    // Adding override of area calculation from Shape interface method
    @Override
    public double area() {
        return side * side;
    }
}

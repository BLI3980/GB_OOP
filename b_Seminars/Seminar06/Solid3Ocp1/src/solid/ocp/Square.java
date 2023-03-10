package Solid3Ocp1.src.solid.ocp;

public class Square  implements Shape {
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

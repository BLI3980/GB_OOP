package Solid4Lsp1.src.solid.lsp;

public class Square extends Quadrilateral { // Changing the extension from Rectangle to Quadrilateral
    // Modifying this class according to Quadrilateral extension
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
//    @Override
//    public void setSideA(int sideA) {
//        super.setSideA(sideA);
//    }
//
//    @Override
//    public void setSideB(int sideB) {
//        super.setSideA(sideB);
//    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSide(), 2);
    }

    @Override
    public String toString() {
        return String.format("\nКвадрат имеет сторону, равную: %s", getSide());
    }
}

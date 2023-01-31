package Solid1Srp1.src.solid.srp;

public class SquareDraw {

    public Square square;

    public SquareDraw(Square square) {
        this.square = square;
    }

    public SquareDraw() {
    }

    public void draw() {
        for (int i = 0; i < square.getSide(); i++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 0; i < square.getSide()-2; i++) {
            System.out.print(" * ");
            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print("   ");
            }
            System.out.println(" * ");
        }
        for (int i = 0; i < square.getSide(); i++) {
            System.out.print(" * ");
        }
    }
}

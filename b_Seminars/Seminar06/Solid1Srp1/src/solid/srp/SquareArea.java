package Solid1Srp1.src.solid.srp;

public class SquareArea {
    Square square;

    public SquareArea(Square square) {
        this.square = square;
    }

    public int area(){
       return square.getSide() * square.getSide();
    }
}

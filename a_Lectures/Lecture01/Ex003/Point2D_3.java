 /**
 * Это точка 2D
*/
public class Point2D_3 {
    private int x, y; // Это координата х и у - bad example of type of comment

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     **/

    /**
     * Bla bla bla - comments
     **/
// =======================================================================
// Note, same thing with signatures as with methods is possible with constructors also
// If we have a constructor with X parameters, but then we need to have a constructor for Y
// amount of parameters we can re-use initial constructor instead of creating new
// constructor each time. As long as the initial constructor has the broadest amount of
// parameters:
    public Point2D_3(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    // The same as constructor behavior as in the one above
//    public Point2D_3(int value) {
//        this.x = value;
//        tnis.y = value;
//    }
    public Point2D_3(int value) {
        this(value, value);
    }
    public Point2D_3() {
        this(0);
    }
// =======================================================================
//Overriding methods:
     private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
// Redefining the method for ourselves

     @Override
    public String toString() {
        return getInfo();
    }


// =======================================================================
// Level of access:
     public int getX(){
         return x;
     }

     public int getY(){
         return y;
     }
     public void setX(int value){
         this.x = value;
     }
     public void setY(int value){
         this.y = value;
     }

    public static double distance(Point2D_3 a, Point2D_3 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}

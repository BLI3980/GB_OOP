
public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

// Note, two methods called "distance" but with different amount/type of parameters
// and might have different methods bodies. This is called methods with different
// *signatures*
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.x = 0;
        a.y = 2;

// Note, by default when printing the subject is printed as toString
// You can change this behaviour (in fact any method's behaviour) by overriding it
// locally within your class
        System.out.println(a.toString());

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
        
    }
}

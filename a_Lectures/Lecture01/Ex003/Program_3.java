

public class Program_3 {
    public static void main(String[] args) {
        Point2D_3 a = new Point2D_3(0, 2);
        a.setX(12);
        System.out.println("1. " + a.getX());
        // Point2D a = new Point2D(0, 2);
//        System.out.println(a.getInfo());
        System.out.println("2. " + a.getX());
        System.out.println("3. " + a.getY());
        Point2D_3 b = new Point2D_3(0);
        System.out.println("4. " + b);
        System.out.println("5. " + b.toString());
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D_3.distance(a, b);
        System.out.println("6. " + dis);
    }
}

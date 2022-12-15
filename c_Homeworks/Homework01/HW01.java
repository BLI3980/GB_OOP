import java.util.ArrayList;
import java.util.List;

public class HW01 {
    public static void main(String[] args) {
        List<Product> snackBars = new ArrayList<>();
        snackBars.add(new SnackBars("Snickers", 57, 488));
        snackBars.add(new SnackBars("Kit Kat", 87, 518));
        snackBars.add(new SnackBars("snickers", 62, 525));
        Vending machine5 = new Vending(snackBars);
        System.out.println(machine5);
        System.out.println(machine5.findByPriceRange(50, 70));

    }
}

import java.util.ArrayList;
import java.util.List;

public class Seminar01 {
    public static void main(String[] args) {
        Product water = new Product("H2O", 120.5);
        System.out.println(water);

        // Default list of products:
        Vending machine1 = new Vending();
        System.out.printf("Vending machine1: " + machine1);

        // Make a list of products, create new VM and and fill it with created list:
        List<Product> beverages = new ArrayList<>();
        beverages.add(water);
        beverages.add(new Product("milk", 200));
        beverages.add(new Product("champagne", 6000));
        beverages.add(new Dairy("milk", 55, "3%"));

        Vending machine2 = new Vending(beverages);
        System.out.println(machine2);

        // Make another list of products (groceries), another VM, also fill it:
        Product orange = new Product("clementine", 600);
        List<Product> groceries = new ArrayList<>();
        groceries.add(new Product("mango", 850));
        groceries.add(new Product("banana", 80));
        groceries.add(new Product("avokado", 800));
        groceries.add(orange);

        Vending machine3 = new Vending(groceries);
        System.out.println(groceries);
        System.out.println(machine3);

        List<Product> vegies = new ArrayList<>();
        vegies.add(new Vegetables("potato", 80, "Belarus"));
        vegies.add(new Vegetables("corn", 110, "Argentina"));
        Vending machine4 = new Vending(vegies);
        System.out.println(machine4);

        System.out.println(machine3.findByName("mango"));
        System.out.println(machine3.findByPrice(800));
        System.out.println(machine3.findByPriceRange(500, 900));

    }
}

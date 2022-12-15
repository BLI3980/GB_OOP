import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Vending {
    // ============ Creation of vending list at seminar ===================
// Create a field as a list of products:
    private List<Product> productList;

    // Create another field as a list of products by default:
    private static List<Product> byDefault = new ArrayList<>(Arrays.asList(new Product("lemonade", 50)));

    // Create a Constructor:
    public Vending(List<Product> productList) {
        this.productList = productList;
    }

    // Create another Constructor, which does not take any parameters and which gives a list of
// products by default:
    public Vending() {
//        this.productList = new ArrayList<>(Arrays.asList(new Product("lemonade", 50)));
        this(byDefault); // In brackets because is calls for a constructor.
    }
// ========= end region ================================================

// ============ Creation of my the vending list on my own ==============
//private List<Product> productList = new ArrayList<>();
//    public Vending(List<Product> productList) {
//        this.productList = productList;
//    }
//    public Vending() {
//        this.productList = productList;
//    }
// ========= end region ================================================


    public String toString() {
        StringBuilder result = new StringBuilder();
        productList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

//    public List<Product> findByName(String name) {
//        List<Product> result = new ArrayList<>();
//        productList.forEach(i -> {
//            if (i.getName().equals(name))
//                result.add(i);
//        });
//        return result;
//    }

    public List<Product> findByName(String name) {
        return finder(p -> p.getName().equals(name));
    }

//    public List<Product> findByPrice(double price) {
//        List<Product> result = new ArrayList<>();
//        productList.forEach(i -> {
//            if (i.getPrice() == price)
//                result.add(i);
//        });
//        return result;
//    }

    public List<Product> findByPrice(double price) {
        return finder(p -> p.getPrice() == price);
    }

//    public List<Product> findByPriceRange(double priceLow, double priceHigh) {
//        List<Product> result = new ArrayList<>();
//        productList.forEach(i -> {
//            if (i.getPrice() > priceLow && i.getPrice() < priceHigh)
//                result.add(i);
//        });
//        return result;
//    }

    public List<Product> findByPriceRange(double priceLow, double priceHigh) {
        return finder(p -> p.getPrice()<priceHigh && p.getPrice()>priceLow);
    }

    private List<Product> finder(Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        productList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
    }


}

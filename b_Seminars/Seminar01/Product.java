public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    private void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("Name = %s; Price = %f", name, price);
    }
}

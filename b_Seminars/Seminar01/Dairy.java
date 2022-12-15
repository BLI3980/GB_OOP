
    // Make another product category as an Inheritance:
public class Dairy extends Product{
    // Create new Field:
    private String fat;

    // Create a Constructor:
    public Dairy(String name, double price, String fat) {
        super(name, price);
        this.setFat(fat);
    }

    // Make Encapsulation (getter, setter):
    // Create getter:
    public String getFat() {
        return fat;
    }

    // Create setter:
    private void setFat(String fat) {
        this.fat = fat;
    }

    // Polymorphism:
    @Override
    public String toString() {
        return String.format("%s; Fat = %s",super.toString(),fat);
    }
}

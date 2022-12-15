public class SnackBars extends Product{
//    private String origin;
    private int calories;

    public SnackBars(String name, double price, int calories) {
        super(name, price);
        this.setCalories(calories);
    }

    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public String toString() {
        return String.format("%s; calorie, kcal/100g: %s", super.toString(), calories);
    }
}

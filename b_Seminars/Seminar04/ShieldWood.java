public class ShieldWood extends Shield{
    @Override
    public int protection() {
        return 30;
    }

    @Override
    public String toString() {
        return "Wooden shield: " + super.toString();
    }
}

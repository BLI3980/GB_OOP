public class ShieldSteel extends Shield{
    @Override
    public int protection() {
        return 50;
    }

    @Override
    public String toString() {
        return "Steel Shield: " + super.toString();
    }
}

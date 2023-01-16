public class OneHandSword extends Sword{
    @Override
    public int handsGrip() {
        return 1;
    }

    @Override
    public int damage() {
        return 12;
    }

    @Override
    public String toString() {
        return "One Hand Sword: " + super.toString();
    }
}

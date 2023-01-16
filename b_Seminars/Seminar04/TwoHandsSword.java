public class TwoHandsSword extends Sword{
    @Override
    public int handsGrip() {
        return 2;
    }

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return "Two Hands Sword: " + super.toString();
    }
}

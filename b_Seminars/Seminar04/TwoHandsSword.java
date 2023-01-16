public class BigSword extends Sword{
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
        return "Big Sword: " + super.toString();
    }
}

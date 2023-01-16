public class BigAxe extends Axe{
    @Override
    public int axeGrip() {
        return 2;
    }

    @Override
    public int damage() {
        return 40;
    }

    @Override
    public String toString() {
        return "Big Axe: " + super.toString();
    }
}

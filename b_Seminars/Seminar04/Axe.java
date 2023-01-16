public abstract class Axe implements Weapon {
    public abstract int axeGrip();

    @Override
    public String toString() {
        return String.format("Axe is gripped with: %d hands, Damage percentage: %d", axeGrip(),damage());
    }
}

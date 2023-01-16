public abstract class Bow implements Weapon{
    public abstract int range();

    @Override
    public String toString() {
        return String.format("Bow damage range: %d meters; Damage percentage: %d", range(), damage());
    }
}

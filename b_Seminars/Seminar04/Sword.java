public abstract class Sword implements Weapon {
    public abstract int handsGrip();

    @Override
    public String toString() {
        return String.format("Sword is gripped with: %d hands, Damage percentage: %d", handsGrip(), damage());
    }
}

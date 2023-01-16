public class Archer extends Warrior<Bow, Shield>{
//    Bow bow;
    private int damageDist;

    public Archer(String name, Bow bow, Shield shield, int healthPoint, int damageDist) {
        super(name, bow, shield, healthPoint);
        this.damageDist = damageDist;
    }

    @Override
    public String toString() {
        return "Archer: " + super.toString();
    }
}

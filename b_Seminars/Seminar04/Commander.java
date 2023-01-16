public class Commander extends Warrior<Weapon, Shield>{

    public Commander(String name, Weapon weapon, Shield shield, int healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Commander: " + super.toString();
    }
}

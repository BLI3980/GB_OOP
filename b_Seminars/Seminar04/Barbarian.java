public class Barbarian extends Warrior<Axe, Shield>{

    public Barbarian(String name, Axe axe, Shield shield, int healthPoint) {
        super(name, axe, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Barbarian: " + super.toString();
    }
}

public class Swordsman extends Warrior<Sword, Shield>{
//    Sword sword;
    public Swordsman(String name, Sword sword, Shield shield, int healthPoint) {
        super(name, sword, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Swordsman: " + super.toString();
    }
}

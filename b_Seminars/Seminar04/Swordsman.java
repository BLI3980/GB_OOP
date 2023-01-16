public class Swordsman extends Warrior{
//    Sword sword;
    public Swordsman(String name, Sword sword, int healthPoint) {
        super(name, sword, healthPoint);
    }

    @Override
    public String toString() {
        return "Swordsman: " + super.toString();
    }
}

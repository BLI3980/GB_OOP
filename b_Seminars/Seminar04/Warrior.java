public abstract class Warrior<T extends Weapon, S extends Shield> {
    // Fields
    private String name;
    private T weapon;
    private S shield;
    private int healthPoint;

    // Constructor
    public Warrior(String name, T weapon, S shield, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    // Getters
    public String getName() {
        return name;
    }
    public T getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }
    public int getHealthPoint() {
        return healthPoint;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    // toString
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon.toString() +
                ", shield=" + shield +
                ", healthPoint=" + healthPoint +
                '}';
    }

    // if use own toString override format:
//    public String toString() {
//        return String.format("name: %d, weapon: %s, health: %d",
//                name, weapon, healthPoint)
//    }
}

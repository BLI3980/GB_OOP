//package Lesson_07.Ex006;

// Inheritance:
public class Magician_6 extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician_6() {
        // Use "super." instead of "this." when applying from inherited classes
        // to conditions of base classes
        super(String.format("Hero_Magician #%d", ++Magician_6.number),
                Magician_6.r.nextInt(100, 200));
        this.maxMana = Magician_6.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
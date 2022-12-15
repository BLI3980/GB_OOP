//package Lesson_07.Ex007;
 
public class Magician_7 extends BaseHero_7 {

    private int mana;
    private int maxMana;

    public Magician_7() {
        super(String.format("Hero_Magician #%d", ++Magician_7.number),
                Magician_7.r.nextInt(100, 200));
        this.maxMana = Magician_7.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
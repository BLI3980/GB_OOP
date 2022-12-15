//package Lesson_07.Ex006;

public class Priest_6 extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest_6() {
        super(String.format("Hero_Priest #%d", ++Magician_6.number),
                Magician_6.r.nextInt(100, 200));
        this.maxElixir = Magician_6.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}

//package Lesson_07.Ex007;
 
public class Priest_7 extends BaseHero_7 {

    private int elixir;
    private int maxElixir;

    public Priest_7() {
        super(String.format("Hero_Priest #%d", ++Priest_7.number),
                Priest_7.r.nextInt(100, 200));
        this.maxElixir = Priest_7.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}

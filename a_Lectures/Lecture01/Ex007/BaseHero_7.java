//package Lesson_07.Ex007;

import java.util.Random;
 
public class BaseHero_7 {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero_7.number = 0;
        BaseHero_7.r = new Random();
    }

    public BaseHero_7(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero_7() {
        this(String.format("Hero_Priest #%d", ++BaseHero_7.number),
                BaseHero_7.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(BaseHero_7 target) {
        int damage = BaseHero_7.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E>{
    List<E> warriorTeam = new ArrayList<>();

    private Commander commander;

    public Team(Commander commander) {
        this.commander = commander;
    }

    public Commander getCommander() {
        return commander;
    }

    public void addWarrior(E newWarrior){
        warriorTeam.add(newWarrior);
    }


    @Override
    public Iterator<E> iterator() {
        return warriorTeam.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for(E item: warriorTeam) {
            sumDamage += item.getWeapon().damage();
        };
        return sumDamage;
    }

    public int getAllHP() {
        int sumHP = 0;
        for (E item: this) { // Can use "this" here instead of "warriorTeam" as this refers to an iterable instance of this class
            sumHP += item.getHealthPoint();
        };
        return  sumHP;
    }

    public int getAllProtection() {
        int sumProtection = 0;
        for (E warrior: warriorTeam) {
            sumProtection += warrior.getShield().protection();
        };
        return sumProtection;
    }

    public int maxDamageRange() {
        int maxDR = 0;
        for(E item: this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (bow.range() > maxDR) {
                    maxDR = bow.range();
                }
            }
        }
        return maxDR;
    }
}

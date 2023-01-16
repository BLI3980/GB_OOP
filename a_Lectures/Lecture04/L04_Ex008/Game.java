package L04_Ex008;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Game {
    public static void main(String[] args) {
        System.out.println("The Game");

        Team<Intern> team1 = new Team<>("Team1");
        team1.add(Gb.CreateIntern());
        team1.add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Team2");
        team2.add(Gb.CreateIntern());
        team2.add(Gb.CreateIntern());
//        team2.add(Gb.CreateMiddle());
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);
        o.start();

        // #region
//        System.out.println("\nst1 vs st2");
//        var st1 = new Team<String>("String team 1");
//        var st2 = new Team<String>("String team 2");
//
//        Olympiad<String> o1 = new Olympiad<>(st1, st2);
//        o1.start();

        // #endregion
    }
}

abstract class Programmer {
    private String fullName;
    private int age;

    public Programmer(){
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[Name: %s; age: %d; seniority: %s]", fullName, age, sn);
    }
}
class Intern extends Programmer{
    private String fullName;
    private int age;

    public Intern(){
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[Name: %s; age: %d; seniority: %s]", fullName, age, sn);
    }
}
class Junior extends Programmer{
    private String fullName;
    private int age;

    public Junior(){
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[Name: %s; age: %d; seniority: %s]", fullName, age, sn);
    }
}
class Middle extends Programmer{
    private String fullName;
    private int age;

    public Middle(){
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[Name: %s; age: %d; seniority: %s]", fullName, age, sn);
    }
}
class Principal extends Programmer{
    private String fullName;
    private int age;

    public Principal(){
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }

    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[Name: %s; age: %d; seniority: %s]", fullName, age, sn);
    }
}
class Team<T extends Programmer>{
    private String name;
    private List<T> programmers;

    public Team(String name) {
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void add(T p){
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, programmers);
    }
}
class Olympiad<T extends Programmer>{

    Team<T> team1, team2;
    Random r = new Random();

    public Olympiad(Team<T> t1, Team<T> t2) {
        team1 = t1;
        team2 = t2;
    }

    public void start(){
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.println(String.format("Winner: %s", winner));
    }
}
class Gb{
    public static Programmer CreateEmployee(int i){
        switch (i){
            case 0:
                return new Intern();
            case 1:
                return new Middle();
            default:
                return new Principal();
        }
    }

    public static Intern CreateIntern(){
        return new Intern();
    }
    public static Middle CreateMiddle(){
        return new Middle();
    }
    public static Principal CreatePrincipal(){
        return new Principal();
    }
}

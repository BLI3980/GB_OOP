//package Lesson_07.Ex006;

public class Program_6 {
    public static void main(String[] args) {
        Magician_6 hero1 = new Magician_6();
        System.out.println(hero1.getInfo());
        
        Priest_6 hero2 = new Priest_6();
        System.out.println(hero2.getInfo());

        Priest_6 hero3 = new Priest_6();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());
    }
}
//package Lesson_07.Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program_7 {
    public static void main(String[] args) {
      
        // #region ex1 Demo

         BaseHero_7 hero3 = new Magician_7();
         System.out.println(hero3.getInfo());

         BaseHero_7 hero4 = new Priest_7();
         System.out.println(hero4.getInfo());

        // #endregion

        // #region ex2 Attack
         System.out.println("------");
         System.out.println(hero3.getInfo());
         System.out.println(hero4.getInfo());

         hero3.Attack(hero4);
        
         hero4.Attack(hero3);
         System.out.println(hero3.getInfo());
         System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams

        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
 

        List<BaseHero_7> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new Priest_7());
                priestCount++;
            }
            else{
                teams.add(new Magician_7());
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}
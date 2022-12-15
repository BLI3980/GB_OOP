//package Lesson_07.Ex006;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest_6[] priests = new Priest_6[priestCount];
        Magician_6[] magicians = new Magician_6[magicianCount];

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest_6();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician_6();
            System.out.println(magicians[i].getInfo());
        }

    }

}

public class Main {
    public static void main(String[] args) {
        Commander commander = new Commander("Snow", new TwoHandsSword(), 150);
        Team<Swordsman> swordsmanTeam = new Team<>(commander);
        System.out.println(commander);

        swordsmanTeam.addWarrior(new Swordsman("Sman1", new OneHandSword(), 100));
        swordsmanTeam.addWarrior(new Swordsman("Sman2", new TwoHandsSword(), 95));
        swordsmanTeam.addWarrior(new Swordsman("Sman3", new TwoHandsSword(), 110));

        swordsmanTeam.forEach(item -> System.out.println(item));


    }
}

public class Main4 {
    public static void main(String[] args) {
        System.out.println("============ Team 1 ==============");
        Commander commander1 = new Commander("Snow", new TwoHandsSword(), new ShieldSteel(),150);
        Team<Swordsman> swordsmanTeam = new Team<>(commander1);
        System.out.println(commander1);
        swordsmanTeam.addWarrior(new Swordsman("Sman1", new OneHandSword(), new ShieldSteel(), 100));
        swordsmanTeam.addWarrior(new Swordsman("Sman2", new TwoHandsSword(), new ShieldWood(), 95));
        swordsmanTeam.addWarrior(new Swordsman("Sman3", new TwoHandsSword(), new ShieldSteel(), 110));

        swordsmanTeam.forEach(item -> System.out.println(item));
        System.out.println("The sum of all damages for this team: " + swordsmanTeam.getAllDamage());
        System.out.println("The sum of all health points for this team: " + swordsmanTeam.getAllHP());
        System.out.println("The maximum damage range for this team: " + swordsmanTeam.maxDamageRange());



        System.out.println("============ Team 2 ==============");
        Commander commander2 = new Commander("Hail", new BigAxe(), new ShieldSteel(),170);
        Team<Archer> archerTeam = new Team<>(commander1);
        System.out.println(commander2);
        archerTeam.addWarrior(new Archer("Archman1", new LongBow(), new ShieldWood(), 105, 200));
        archerTeam.addWarrior(new Archer("Archman2", new LongBow(), new ShieldWood(), 95, 180));

        archerTeam.forEach(item -> System.out.println(item));
        System.out.println("The sum of all damages for this team: " + archerTeam.getAllDamage());
        System.out.println("The sum of all health points for this team: " + archerTeam.getAllHP());
        System.out.println("The maximum damage range for this team: " + archerTeam.maxDamageRange());

        System.out.println("============ Team 3 ==============");
        Commander commander3 = new Commander("Rain", new BigAxe(), new ShieldWood(), 250);
        Team<Warrior> mixedTeam = new Team<>(commander3);
        System.out.println(commander3);
        mixedTeam.addWarrior(new Swordsman("Mixed1Sman", new OneHandSword(), new ShieldSteel(), 120));
        mixedTeam.addWarrior(new Archer("Mixed1Arc", new LongBow(), new ShieldWood(), 92, 180));
        mixedTeam.addWarrior(new Barbarian("Mixed1Barb", new BigAxe(), new ShieldWood(), 130));
        for (Warrior item: mixedTeam) {
            System.out.println(item);
        }
        System.out.println("The sum of all damages for this team: " + mixedTeam.getAllDamage());
        System.out.println("The sum of all health points for this team: " + mixedTeam.getAllHP());
        System.out.println("The maximum damage range for this team: " + mixedTeam.maxDamageRange());



    }
}

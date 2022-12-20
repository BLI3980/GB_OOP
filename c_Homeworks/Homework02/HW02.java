public class HW02 {
    public static void main(String[] args) {
        AquaZoo aquaZoo = new AquaZoo();
        aquaZoo.addSeaAnimal(new SeaLion("Sea Lion","AlphaLion", 2.5,true))
                .addSeaAnimal(new WhiteShark("Great White Shark", "GreatWhite", 5, false))
                .addSeaAnimal(new Orca("Orca Whale","Willy", 7.9, true));

        System.out.println("=================================");
        System.out.println("List of Aqua Zoo sea animals: ");
        aquaZoo.getSeaAnimals();
        System.out.println("=================================");
        System.out.println("List of Aqua Zoo sea animals swim speeds: ");
        for (Swimmable item: aquaZoo.getSwimSpeed()) {
            System.out.printf("Speed %d km/hr;\n", item.swimSpeed());
        }
        System.out.println("=================================");

    }
}

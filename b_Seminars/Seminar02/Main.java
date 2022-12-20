public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Barsik","Ivan", 3, "British"))
                .addAnimal(new Dog("Tuzik", "Vasiliy", 5, true))
                .addAnimal(new Bird("Noisy", "Masha", 1, false))
                .addAnimal(new Duck("Donald", "Petr", 4))
                .addAnimal(new Eagle("Stells", "No owner / wild animal", 40))
                .addAnimal(new Seal("Torpedo", "No owner / wild animal", 8));
        System.out.println("1.====================");
        System.out.println(zoo.getAnimals());
        System.out.println(zoo);
        System.out.println("2. ===================");
        System.out.println(zoo.talk());
        System.out.println("3. ===================");
        for (Runnable item: zoo.getRunnable()) {
            System.out.println(item.runSpeed());
        }
        System.out.println("4. ===================");
        System.out.println(zoo.getFastest());
        System.out.println("5. ===================");
        for (Flyable item: zoo.getFlyable()) {
            System.out.println(item.flySpeed());
        }
        System.out.println("6. ===================");
        SaveManager saveManager = new SaveManager();
        saveManager.saveToFile(zoo.getAnimals());

    }
}

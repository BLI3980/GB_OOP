public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Barsik","Ivan", 3, "British"))
                .addAnimal(new Dog("Tuzik", "Vasiliy", 5, true))
                .addAnimal(new Bird("Noisy", "Masha", 1, false))
                .addAnimal(new Duck("Donald", "Petr", 4))
                .addAnimal(new Eagle("Stells", "Stepan", 40));
        System.out.println(zoo);
        System.out.println("===================");
        System.out.println(zoo.talk());
        System.out.println("===================");
        for (Runnable item: zoo.getRunnable()) {
            System.out.println(item.runSpeed());
        }
        System.out.println("===================");
        System.out.println(zoo.getFastest());
        System.out.println("===================");
        for (Flyable item: zoo.getFlyable()) {
            System.out.println(item.flySpeed());
        }
        System.out.println("===================");
        SaveManager saveManager = new SaveManager();
        saveManager.saveToFile(zoo.getAnimals());

    }
}

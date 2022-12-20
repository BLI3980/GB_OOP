public class Cat extends Animal implements Speakable, Runnable{
    String breed;

    public Cat(String name, String owner, int age, String breed) {
        super(name, owner, age);
        this.breed = breed;
    }

    public Cat(String breed) {
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Cat: meow-meow";
    }

    @Override
    public Integer runSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}

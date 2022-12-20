public class Dog extends Animal implements Speakable, Runnable{
    boolean isHunting;

    public Dog(String name, String owner, int age, boolean isHunting) {
        super(name, owner, age);
        this.isHunting = isHunting;
    }


    @Override
    public String speak() {
        return "Dog: woof-woof";
    }

    @Override
    public Integer runSpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }
}

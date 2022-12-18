public class Eagle extends Animal implements Speakable, Runnable, Flyable{

    public Eagle(String name, String owner, int age) {
        super(name, owner, age);
    }

    @Override
    public int flySpeed() {
        return 700;
    }

    @Override
    public Integer runSpeed() {
        return 15;
    }

    @Override
    public String speak() {
        return "Eagle: AAA";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}

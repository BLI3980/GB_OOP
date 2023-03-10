public class Duck extends Animal implements Speakable, Runnable, Flyable, Swimmable{

    public Duck(String name, String owner, int age) {
        super(name, owner, age);
    }

    @Override
    public int flySpeed() {
        return 500;
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }

    public int swimSpeed(){
        return 15;
    }

    @Override
    public String speak() {
        return "Duck: kwak-kwak";
    }

    @Override
    public String toString() {
        return "Duck: " + super.toString();
    }
}

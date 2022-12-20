public class Seal extends Animal implements Swimmable{
    public Seal(String name, String owner, int age) {
        super(name, owner, age);
    }

    @Override
    public int swimSpeed() {
        return 120;
    }

    @Override
    public String toString() {
        return "Seal: " + super.toString();
    }
}

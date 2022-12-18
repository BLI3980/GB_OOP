public class Bird extends Animal implements Speakable{
    private boolean canFly;

    public Bird(String name, String owner, int age, boolean canFly) {
        super(name, owner, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    @Override
    public String toString() {
        return String.format("Bird: %s; Flies?: %b", super.toString(), isCanFly());
    }

    @Override
    public String speak() {
        return "Bird: chirp-chirp";
    }

}

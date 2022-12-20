public class SeaLion extends SeaAnimal implements Swimmable{
    public SeaLion(String animal, String name, double size, boolean isMammal) {
        super(animal, name, size, isMammal);
    }

    @Override
    public int swimSpeed() {
        return 45;
    }
}

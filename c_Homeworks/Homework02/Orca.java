public class Orca extends SeaAnimal implements Swimmable{
    public Orca(String animal, String name, double size, boolean isMammal){
        super(animal, name, size, isMammal);
    }

    @Override
    public int swimSpeed() {
        return 56;
    }
}

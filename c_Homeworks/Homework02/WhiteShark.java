public class WhiteShark extends SeaAnimal implements Swimmable{
    public WhiteShark(String animal, String name, double size, boolean isMammal){
        super(animal, name, size, isMammal);
    }

    @Override
    public int swimSpeed() {
        return 50;
    }
}

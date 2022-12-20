import java.util.ArrayList;
import java.util.List;

public class AquaZoo {
    public List<SeaAnimal> seaAnimals = new ArrayList<>();

    public void getSeaAnimals(){
        seaAnimals.forEach(i -> System.out.println(i));
    }

    public AquaZoo addSeaAnimal (SeaAnimal seaAnimal){
        seaAnimals.add(seaAnimal);
        return this;
    }

    public List<Swimmable> getSwimSpeed(){
        List<Swimmable> result = new ArrayList<>();
        for (SeaAnimal item: seaAnimals) {
            if(item instanceof Swimmable){
                result.add((Swimmable) item);
            }
        }
        return result;
    }


}

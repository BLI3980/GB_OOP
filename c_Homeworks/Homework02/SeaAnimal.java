public abstract class SeaAnimal {

    private String animal;
    private String name;
    private double size;
    private boolean isMammal;

    public SeaAnimal(String animal, String name, double size, boolean isMammal){
        this.setAnimal(animal);
        this.setName(name);
        this.setSize(size);
        this.setIsMammal(isMammal);
    }

    public String getAnimal(){
        return animal;
    }
    public String getName() {
        return name;
    }
    public double getSize(){
        return size;
    }
    public boolean getIsMammal(){
        return isMammal;
    }

    public String setAnimal(String animal){
        return this.animal = animal;
    }
    public String setName(String name){
        return this.name = name;
    }
    public double setSize(double size){
        return this.size = size;
    }
    public boolean setIsMammal(boolean isMammal){
        return this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return String.format("Animal - %s; Name - %s; Typical size - %,.1f meters; Belongs to mammals? - %b",
                            animal, name, size, isMammal);
    }

}

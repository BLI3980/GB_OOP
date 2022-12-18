public abstract class Animal {
    private String name,
                    owner;
    private int age;
                //wings,
                // fins;


    public Animal(String name, String owner, int age){
        this.setName(name);
        this.setOwner(owner);
        this.setAge(age);
    }

    public Animal() {

    }

    public String getName(){
        return name;
    }
    public String getOwner(){
        return owner;
    }
    public int getAge(){
        return age;
    }

    public String setName(String name){
        return this.name = name;
    }
    public String setOwner(String owner){
        return this.owner = owner;
    }
    public int setAge(int age){
        return this.age = age;
    }


//    @Override
//    public String toString() {
//        return String.format("Name: %s; Owner: %s; Age: %f", name, owner, age);
//    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }

//    public abstract String speak();
}

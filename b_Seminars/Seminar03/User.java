public class User implements Comparable<User> {
// Fields
    private String firstName;
    private String lastName;
    private int age;
    private Personnel subordinates = new Personnel();

// Constructors
    public User(Personnel subordinates, String firstName, String lastName, int age) {
        this(firstName,lastName,age);
        this.subordinates = subordinates;
    }
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public User() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




// Getters
    public Personnel getSubordinates() {
        return subordinates;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

// Setters
    public String setFirstName(String newFirstName) {
        return this.firstName = newFirstName;
    }
    public String setLastName(String newLastName) {
        return this.lastName = newLastName;
    }
    public int setAge(int newAgeValue) {
        return this.age = newAgeValue;
    }

// Overridden toString
    @Override
    public String toString() {
        return String.format("First Name: %s; Last Name: %s; Age: %d", firstName, lastName, age);
    }

// Overridden compareTo. Two level sort - 1. by fullName; 2. by age
    @Override
    public int compareTo(User other) {
        String fullName = this.firstName + this.lastName;
        String fullNameOther = other.firstName + other.lastName;
        if (fullName.equals(fullNameOther)){
            return this.age - other.age;
        }
        return fullName.compareTo(fullNameOther);


//      // Compare by age option1:
//        return this.age - other.age;
//      // Compare by age option2:
//        if (this.age > other.age){
//            return 1;
//        } else if (this.age < other.age){
//            return -1;
//        } else
//            return 0;
    }
}

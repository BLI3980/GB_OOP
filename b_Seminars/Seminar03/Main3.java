import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        user.setAge(24);
        System.out.println(user.getFirstName());

        User user1 = new User("John", "Johnson", 52);


        Personnel personnel = new Personnel();
        personnel.addUser(new User("Ivan", "Ivanov", 33))
                .addUser(new User("Ivan", "Ivanov", 34))
                .addUser(new User("William", "Shakespeare", 458))
                .addUser(user)
                .addUser(user1);

// Print created personnel list
        System.out.println("\n1. ============================================================");
        for (User person: personnel) {
            System.out.println(person);
        }

// Same as before, but using built-in foreach
        System.out.println("\n2. ============================================================");
        personnel.forEach(i-> System.out.println(i));

// Sort by custom compareTo overridden in User and print result
        System.out.println("\n3. ============================================================");
        Collections.sort(personnel.getUserList());
        personnel.forEach(System.out::println);

// Create new variable - main boss. Create company list which includes the main boss and print the
// company list
        System.out.println("\n4. ============================================================");
        User managerBig = new User(personnel,"Boss", "OfEveryone", 60);
        Company company = new Company(managerBig);
        for (User item: company) {
            System.out.println("Employee: " + item);
        }

// Create smaller boss with a couple new employees reporting to him. The smaller boss also reports
// to the main boss. Print new company list.
        System.out.println("\n5. ============================================================");
        Personnel personnel1 = new Personnel();
        personnel1.addUser(new User("Petr", "Sidorov", 25))
                .addUser(new User("Masha", "Medvedeva", 23));
        User managerSmall = new User(personnel1, "Bossio", "Bossinio", 45);
        personnel.addUser(managerSmall);
        Company company1 = new Company(managerBig);
        for (User item: company1) {
            System.out.println("Employee: " + item);
        }

// Print personnel list again to show that it prints only whoever is in personnel list. I.e. does
// not print full company tree list
        System.out.println("\n6. ============================================================");
        personnel.forEach(System.out::println);


    }
}

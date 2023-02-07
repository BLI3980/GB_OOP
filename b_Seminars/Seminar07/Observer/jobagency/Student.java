package Observer.jobagency;

// Студент, цепляется за любую работу, которая лучше текущей
public class Student implements Observer {
    String name;
    int salary;

    public Student(String name){
        this.name = name;
        salary = 0;
    }

    // Студент постоянно ищет где лучше
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Student %s response: Yes! I need this work!\n", nameCompany, salary, name));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Student %s response: Thanks, but no.\n", nameCompany, salary, name));
        }
    }
}

package Observer.jobagency;

// Профи, ищет хорошую работу
public class Master implements Observer {
    String name;

    public Master(String name){
        this.name = name;
    }

    // Профессионалы выбирают хорошую работу
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 80){
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Master %s response: I am waiting for the better job! \n", nameCompany, salary, name));
        }
        else{
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Master %s response: Ok. I think is offer is up to my liking! \n", nameCompany, salary, name));
        }
    }
}

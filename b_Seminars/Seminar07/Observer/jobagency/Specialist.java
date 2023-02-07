package Observer.jobagency;

import java.util.Random;

public class Specialist implements Observer{
    private String name;

     private int salary;

    public Specialist(String name) {
        this.name = name;
        this.salary = new Random().nextInt(50,80);
    }

    // Specialist want a job in Google with salary greater than his current salary
    @Override
    public void receiveOffer(String nameCompany, int offersSalary) {
        if (this.salary < offersSalary && nameCompany == "Google"){
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Specialist %s response: Mmm, let me think about that... Ok, when do I start?\n",
                    nameCompany, offersSalary, name, salary));
            this.salary = offersSalary;
        }
        else{
            System.out.println(String.format("Job offer: (company, salary) = %s, %d.\n" +
                    "Specialist %s response: No! I want Google and salary greater than" +
                    " %d \n", nameCompany, offersSalary, name, salary));
        }
    }
}

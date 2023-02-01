package HW06;

public class ReportType2 implements Reportable{
    @Override
    public void output(User user) {
        System.out.printf("Report of Type 2 for user %s.\n", user.getName());
    }
}

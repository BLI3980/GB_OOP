package HW06;

public class ReportType1 implements Reportable{

    @Override
    public void output(User user) {
        System.out.format("Report of Type 1 for user %s.\n", user.getName());
    }
}

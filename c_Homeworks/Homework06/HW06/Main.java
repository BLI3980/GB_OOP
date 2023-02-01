package HW06;

public class Main{
	public static void main(String[] args){
		Persister persister = new Persister("Mike");
		ReportManager report1 = new ReportManager(new ReportType1());
		report1.output(persister);
		User user = new Persister("John Doe");
		ReportManager report2 = new ReportManager(new ReportType2());
		report2.output(user);
		SaveManager saveFormat1 = new SaveManager(new SaveFormat1());
		saveFormat1.save(persister);

	}
}
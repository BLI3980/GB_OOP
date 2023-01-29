package Solid7Dip.src.solid;

import Solid7Dip.src.solid.dip.DisplayReport;
import Solid7Dip.src.solid.dip.PrintReport;
import Solid7Dip.src.solid.dip.Report;
import Solid7Dip.src.solid.dip.ReportManager;

public class MainSolid5 {
    public static void main(String[] args) {
        Report report = new Report();
        ReportManager reportManager = new ReportManager(new PrintReport());
        report.calculate();
        reportManager.output(report.getItems());
        ReportManager reportManager1 = new ReportManager(new DisplayReport());
        reportManager1.output(report.getItems());
    }
}

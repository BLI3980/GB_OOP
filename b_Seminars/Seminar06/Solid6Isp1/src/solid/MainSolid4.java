package Solid6Isp1.src.solid;

import Solid6Isp1.src.solid.isp.InternetPaymentService;
import Solid6Isp1.src.solid.isp.TerminalPaymentService;

public class MainSolid4 {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(20);
        internetService.payPhoneNumber(30);
        System.out.println();

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(20);
//        terminalService.payPhoneNumber(10); // Error in attempt to call for this command
    }
}

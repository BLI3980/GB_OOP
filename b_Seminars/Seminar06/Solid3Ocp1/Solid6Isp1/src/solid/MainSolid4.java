package Solid3Ocp1.Solid6Isp1.src.solid;

import Solid3Ocp1.Solid6Isp1.src.solid.isp.InternetPaymentService;
import Solid3Ocp1.Solid6Isp1.src.solid.isp.TerminalPaymentService;

public class MainSolid4 {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
        terminalService.payPhoneNumber(10);
    }
}

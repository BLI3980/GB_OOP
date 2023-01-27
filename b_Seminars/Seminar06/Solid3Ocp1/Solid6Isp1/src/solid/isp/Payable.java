package Solid3Ocp1.Solid6Isp1.src.solid.isp;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}

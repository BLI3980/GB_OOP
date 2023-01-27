// Interface segregation principle
// Принцип разделения интерфейса 
// Клиенты не должны реализовывать интерфейсы, которые они не используют.
// Данный принцип требует разделения "толстых" интерфейсов на несколько
// специализированных, связанных общей функциональностью.

import java.util.ArrayList;
import java.util.List;

public class Ex004_2ISP {
    public static void main(String[] args) {
        List<BasePhone> phones1 = new ArrayList<BasePhone>();
        phones1.add(new IPhone());
        phones1.add(new Nokia3311());

        List<Fax> phones2 = new ArrayList<>();
        phones2.add(new IPhone());
    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();

}

interface EMail {
// interface EMail extends BasePhone {
    void SendEMail();
}

class IPhone implements BasePhone, Fax, EMail {
// class IPhone implements Fax, EMail {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {
       

    }

    @Override
    public void SendEMail() {
        

    }

    @Override
    public void SendFax() {
    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}
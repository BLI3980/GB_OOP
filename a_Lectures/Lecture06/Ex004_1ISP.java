// Interface segregation principle
// Принцип разделения интерфейса 
// Клиенты не должны реализовывать интерфейсы, которые они не используют.
// Данныей принцип требует разделения "толстых" интерфейсов на несколько
// специализированных, связанных общей функциональностью.

public class Ex004_1ISP {
    public static void main(String[] args) {
        Siemens cx60 = new Siemens();
        cx60.Call(); /// ??? ...
        cx60.SendSMS(); /// ??? ...
        cx60.SendFax(); /// ??? ...
        cx60.SendEMail(); /// ??? ...
    }
}


interface Phone {
    void Call();    
    void SendSMS();    
    void SendEMail();
    void SendFax();
}


class Siemens implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub
        
    }
}

 
class Nokia3310 implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub
        
    }

    
}
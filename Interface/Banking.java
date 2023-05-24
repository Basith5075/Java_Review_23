interface BankingIntf{

    default void deposit(){}
    default void openAccount(){}
    default void withdraw(){}
}

class Cust1 implements BankingIntf{

    public void deposit(){

        System.out.println("Cust 1 Deposit Money into the bank..");
    }
}

class Cust2 implements BankingIntf{

    public void openAccount(){
        System.out.println("Cust 2 Opening account in the bank..");
    }
}

public class Banking {
    
    public static void main(String[] args) {
        BankingIntf cust1 = new Cust1();
        cust1.deposit();

        BankingIntf cust2 = new Cust2();
        cust2.openAccount();
    }
}

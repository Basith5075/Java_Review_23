interface Banking{

    static void bankDetails(){
        System.out.println("!! State Bank of India !!");
        System.out.println("----------------------------");
    }

    private static void verify(){
        System.out.println("Checking the currency notes");
    }

    default void transaction(){
        Banking.bankDetails();
        Banking.verify();
    }
    void deposit();
}

class Customer implements Banking{

    public void deposit(){
        transaction();
        System.out.println("Customer Deposited $ 10,000");
    }

}


public class PrivateInterface {
    public static void main(String[] args) {
        Banking newCustomer = new Customer();
        newCustomer.deposit();
    }
}
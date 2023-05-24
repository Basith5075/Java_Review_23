interface SBI{

    default void show(){
        System.out.println("From the SBI- Show method");
    }

    void custInfo();
}

interface HDFC{

    default void show(){
        System.out.println("From the HDFC- Show method");
    }

    void custInfo();
}

class Customer1 implements SBI,HDFC{

    public void custInfo(){
        System.out.println("Customer name is cust 1");
    }

    public void show(){
        System.out.println("From the Customer1 Show method.");
        SBI.super.show();
        HDFC.super.show();
    }


}
public class DefaultMetInt {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1();
        c1.custInfo();
        c1.show();
    }
}

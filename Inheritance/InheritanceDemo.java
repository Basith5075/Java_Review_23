class BaseClass{

    int a ;

    void display(){
        System.out.println("This is from the Baseclass !!");
        System.out.println("The value of a from base class a ="+a);
    }

}

class DerivedClass extends BaseClass{

    int b;

    void display_d(){
        a = 10;
        b = 20;
        System.out.println("This is from the Derived Class");
        System.out.println("a = "+a+"\n b = "+b);
    }

}
class InheritanceDemo{

    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        dc.display(); // The Same Derived Class Method 
        dc.display_d(); // Calling the base class method using derived class using inheritance

        BaseClass bc = new BaseClass();
        bc.display();
        // bc.display_d(); This will throw Error because this method is not available
    }

}
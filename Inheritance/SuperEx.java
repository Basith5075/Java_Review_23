class FirstClass{

    int a = 10;
    void display(){
        System.out.println("Coming From the First Class a = "+a);
    }
}

class SecondClass extends FirstClass{

    int a = 12;

    void display(){
        super.display();
        System.out.println("Coming From First Class a : "+super.a);
        System.out.println("Coming From the Second Class b = "+a);
    }
}

public class SuperEx {
    
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.display();
    }
}
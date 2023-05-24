import tp.ArithmeticOps;

class ArDemo{

    ArithmeticOps ad = new ArithmeticOps();

    void display(){
        System.out.println("sum = "+ad.sum(2,3));
        System.out.println("Product = "+ad.product(3,3));
        System.out.println("Division = "+ad.div(6,3.1));
    }
}

public class ArithmeticDemo {

    public static void main(String[] args) {
        ArDemo ar = new ArDemo();
        ar.display();
    }
}

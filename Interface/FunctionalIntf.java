import java.util.Scanner;

interface Figure{
    Scanner s = new Scanner(System.in);
    float pi = 3.14f;
    void area(); 
}

class Circle implements Figure{

    @Override
    public void area() {
        System.out.println("Please Enter the radius of the circle: ");
        float r = Float.parseFloat(s.nextLine());
        float ar = pi * r * r;
        System.out.println("The Area of the Circle is :"+ar);
    }
}

class Square implements Figure{

    @Override
    public void area() {
        System.out.println("Please Enter the Side of the Sqaure: ");
        float side = Float.parseFloat(s.nextLine());
        float ar = side * side;
        System.out.println("The Area of the Square is :"+ar);
    }
}

public class FunctionalIntf {
    public static void main(String[] args) {
        Figure f = new Circle();
        f.area();

        f = new Square();
        f.area();
    }
}
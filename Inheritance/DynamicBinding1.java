class Circle{
    float r;
    float ar;

    Circle(){

    }

    Circle(float r){
        this.r = r;
    }
    void area(){
        this.ar = 3.14f * this.r;
        System.out.println("Area of the Circle = "+this.ar);
    }
}

class Rectangle extends Circle{
    float l,b;
    float ar;

    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }
    void area(){
        this.ar = this.l * this.b ;
        System.out.println("Area of the Rectangle = "+this.ar);
    }

}

class Square extends Circle{
    float side;
    float ar;

    Square(float side){
        this.side = side;
    }
    void area(){
        this.ar = side * side;
        System.out.println("Area of the Square = "+this.ar);
    }
}

public class DynamicBinding1 {

    public static void main(String[] args) {
        
        Circle c = new Circle(2.4f);
        c.area();

        c = new Rectangle(2f, 3f);
        c.area();

        c = new Square(4f);
        c.area();
    }
}

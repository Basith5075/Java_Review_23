abstract class Figure{

    abstract void area();
} 

class Circle extends Figure{
    float r;
    float ar;

    Circle(){

    }

    Circle(float r){
        this.r = r;
    }
    @Override
    void area(){
        this.ar = 3.14f * this.r;
        System.out.println("Area of the Circle = "+this.ar);
    }
}

class Rectangle extends Figure{
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

class Square extends Figure{
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


public class AbstractClassEx1 {
    
    public static void main(String[] args) {
        Figure f = new Circle(3.14f);
        f.area();

        f = new Rectangle(3f, 4f);
        f.area();

        f = new Square(4f);
        f.area();
    }
}

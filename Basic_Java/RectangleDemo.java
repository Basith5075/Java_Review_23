class Rectangle{

    float sd, ar, pr;

    void setSides(float s){

        sd = s;
    }

    void calArea(){
        ar = sd * sd;
    }

    void calPerimeter(){
        pr = 4 * sd; 
    }

    void displayResults(){

        System.out.println("Demo Application for calculating Area and Perimeter of a Rectangle:");
        System.out.println("The area of the rectangle is : "+ar);
        System.out.println("The Perimeter of the rectangle is : "+pr);
        System.out.println("Thank You !!");
    }
}

class RectangleDemo{

    public static void main(String[] args) {
        // System.out.println(args.length);
        if(args.length >= 1){
            float sides = Float.parseFloat(args[0]);
            Rectangle rc = new Rectangle();
            rc.setSides(sides);
            rc.calArea();
            rc.calPerimeter();
            rc.displayResults();
            }
        else{
            System.out.println("Please Enter something along with the java command ");
        }
        
        }

}
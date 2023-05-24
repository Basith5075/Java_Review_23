import java.util.Scanner;

interface FigArea{
       void area();
}

public class FunctLambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     
        FigArea fa = ()->{
            System.out.println("Please Enter the Radius of the Circle:");
            float r = Float.parseFloat(scan.nextLine());
            float ar = 3.14f * r * r;
            System.out.println("The area of the circle is : "+ar);
        };

        fa.area();
        scan.close();
    }
    
}

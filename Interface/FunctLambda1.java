import java.util.Scanner;

interface ArithOperations{

    double operations(double a, double b);

}


public class FunctLambda1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Num 1 :");
        double num1 = Double.parseDouble(s.nextLine());

        System.out.println("Please Enter Num 2 :");
        double num2 = Double.parseDouble(s.nextLine());

        ArithOperations aop = (double a, double b)->{          
            return (a+b);
        };
        
        System.out.println("The Sum of a and b is : "+aop.operations(num1,num2));

        aop = (double a, double b)->{          
            return (a-b);
        };
        System.out.println("The Substraction of a and b is : "+aop.operations(num1,num2));

        aop = (double a, double b)->{          
            return (a*b);
        };
        System.out.println("The Multiplication of a and b is : "+aop.operations(num1,num2));


    }
    
}

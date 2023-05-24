import java.util.Scanner;

public class DynamicInputScanner {


        double number;
        String name;
        String classNa;
        void getDetails(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Phone Number:");
        number = Double.parseDouble(sc.nextLine());
        System.out.println("Please Enter the Name:");
        name = sc.nextLine();
        System.out.println("Please Enter the Class:");
        classNa = sc.nextLine();
       
    }

    public void display(){

        System.out.println("Number : "+number);
        System.out.println("Name : "+name);
        System.out.println("Class Name: "+classNa);

    }
    public static void main(String[] args) {
        DynamicInputScanner dis = new DynamicInputScanner();
        dis.getDetails();
        dis.display();
    }
    
}

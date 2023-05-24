import java.util.Scanner;

class CompanyDetails{

    Scanner sc = new Scanner(System.in);
    String companyName;
    String companyLocation;
    private int companyBudget;

    void getCompanyDetails(){
        System.out.println("Please Enter the Company Name : ");
        companyName = sc.nextLine();
        System.out.println("Please Enter the Company Location : ");
        companyLocation = sc.nextLine();
    }

    void displayCompanyDetails(){
        System.out.println("Company Name : "+companyName+"\nCompany Location:"+companyLocation);
    }
}

class EmployeeDetails extends CompanyDetails{

    String empName;
    String empLocation;
    private String empSal = "9999";

    void getEmployeeDetails(){
        System.out.println("Please Enter the Employee Name :");
        empName = sc.nextLine();
        System.out.println("Please Enter the Employee Location :");
        empLocation = sc.nextLine();

    }
    void displayEmployeeDetails(){
        System.out.println("Employee Name : "+empName+"\nEmployee Location:"+empLocation);
        System.out.println(empSal);
        System.out.println(companyName);
        // System.out.println(companyBudget);
    }
}

public class InheritanceEx {
    
    public static void main(String[] args) {
        EmployeeDetails ed = new EmployeeDetails();
        ed.getCompanyDetails();
        ed.getEmployeeDetails();
        ed.displayCompanyDetails();
        ed.displayEmployeeDetails();
    }
}

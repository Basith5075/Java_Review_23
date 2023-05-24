import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

class University{

    String uniName;
    String uniCode;

    Scanner sc = new Scanner(System.in);
    void call(){

        System.out.println("Please Enter the University Name :");
        uniName = sc.nextLine();
        System.out.println("Please Enter the University Code:");
        uniCode = sc.nextLine();
    }

}

class College extends University{
    String collegeName;
    String collegeCode;

    void call(){
        super.call();
        System.out.println("Please Enter the College Name :");
        collegeName = sc.nextLine();
        System.out.println("Please Enter the College Code:");
        collegeCode = sc.nextLine();
    }

    void display() {
        System.out.println("College Name : "+collegeName);
        System.out.println("College Code : "+collegeCode);
    }
}
class Student extends College{
    String studName;
    String studId;

    void call(){
        super.call();
        System.out.println("Please Enter the Student Name :");
        studName = sc.nextLine();
        System.out.println("Please Enter the Student Code:");
        studId = sc.nextLine();
        }

    void display(){
        super.display();
        System.out.println("Student Name : "+studName);
        System.out.println("Student Code : "+studId);
    }
}


public class SuperEx1 {

    public static void main(String[] args) {
        Student sc = new Student();
        sc.call();
        sc.display();
        University ua = new University();
        System.out.println(ua.uniName);
        System.out.println(ua.uniCode);
        System.out.println();
    }
    
}

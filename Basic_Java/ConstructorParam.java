//  Default Constructor
class Test{
    int a, b;
    Test(){
        a = 100;b = 200;
        System.out.println("From the default constructor !!");
    }

    void display(){
        System.out.println("The value of A = "+a);
        System.out.println("The value of B = "+b);
    }
}


class Banking{
    
    int custNum;
    String custName;
    
        Banking(int m, String jamest){
            custNum = m;
            custName = jamest;
            System.out.println("Custum = "+custNum+" Mahi bhai"+custName);
                        
        }

}

class CreditCardApply{
    Banking bnking;

    CreditCardApply(Banking bn){
        bnking = bn;
        System.out.println(bn.custName + "    "+bn.custNum);

    }

}

// # Learning Paraterized constructor here
class Student{

    int sNo;
    String sName;
    int sMarks;

    // Parameterized Constructor
    Student(int snos, String sNames, int sMarke){
        sNo = snos;
        sName = sNames;
        sMarks = sMarke;
        System.out.println("From the Parameterized constructor !!");
        System.out.println("sNo = "+sNo+" Sname = "+sName+" sMarks = "+sMarks);
    }
    // Parameterized Constructor with overloading
    Student(int snos, String sNames){
        sNo = snos;
        sName = sNames;
        System.out.println("sNo = "+sNo+" Sname = "+sName+" sMarks = "+sMarks);

    }
}

public class ConstructorParam {

    public static void main(String[] args) {
        Test t = new Test();
        t.display();

        Student s1 = new Student(1, "Abdul Khadeer",23);
        Student s2 = new Student(2,"Zuhaib Uddin Nawab");

       Banking bkn = new Banking(132, "Outing with home");
        CreditCardApply crd = new CreditCardApply(bkn);
    }

}

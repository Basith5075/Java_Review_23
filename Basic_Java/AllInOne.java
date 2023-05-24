//  In this file I create a class containing the static block, constructor, and \
// an instance method, 
public class AllInOne {
   
    int number;
    String className;
    static String universityName;
    
    // Static Block
    static{
        System.out.println("1 -- From the Static Block");
        universityName = "University of Arkansas at Little Rock !!";
        // number = 7; Compile Time Error 
    }

    // Constructor
    AllInOne(int no,String clasname){
        System.out.println("2 -- From the Constructor");
        number = no;
        className = clasname;
        // universityName = "UTA";
    }

    void display(){
        System.out.println("3 -- From the Instance method display()");
        System.out.println("Number = : "+number+" className : "+className+" Uni Name : "+universityName);
    }
    public static void main(String[] args) {
        System.out.println("I am from main !!");
        AllInOne aone = new AllInOne(11, "Info Viz..");
        aone.display();
    }

}

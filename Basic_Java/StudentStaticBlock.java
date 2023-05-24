class Student{

    int sNo;
    String name;
    static String crs;

    static{
        System.out.println("This is from the static block !! --1");
        crs = "Java";
    }

    Student(int no, String na){
        System.out.println("This is from the Constructor block !! --2");
        sNo = no;
        name = na;
    }
    void displayStud(){
        System.out.println("This is from the method !! --3");
        System.out.println("Student Number : "+sNo+"\nStudent Name :"+name+"\nStudent Course :"+crs);
    }

}

public class StudentStaticBlock {
    public static void main(String[] args) {
        
        Student st = new Student(1, "Abdul Basith");
        st.displayStud();
        Student st1 = new Student(2, "Abdul Khalid");
        st1.displayStud();
    }
}
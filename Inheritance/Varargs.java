class StudentVarArgs{
    String name;
    String className;
    float totalMarks = 0;
    float percentage = 0;
    void calMarks(String name, String className, float ...marks){

        this.name = name;
        this.className = className;
        int counter = 0;
        for(float mk:marks){
            totalMarks = totalMarks + mk;
            counter ++ ;
        }
        
        percentage = (totalMarks/counter);
    }

    void displayResults(){
        System.out.println("Student Name : "+this.name);
        System.out.println("Student's Class Name : "+this.className);
        System.out.println("Students Total Marks : "+this.totalMarks);
        System.out.println("Student's Percentage : "+this.percentage);
    }
}

public class Varargs {

    public static void main(String[] args) {
        StudentVarArgs sva = new StudentVarArgs();
        sva.calMarks("Abdul Basith", "Data Science IFSC 7370", 40f,38f,45f,21f);
        sva.displayResults();
    }
}

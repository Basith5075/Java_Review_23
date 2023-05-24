class DecisionSwitch{
    int mark;
    void passStatus(int marks){

        mark = marks;

        switch(mark){
            case 10:System.out.println("Marks of the students are very less");
            break;
            
            case 11:System.out.println("Marks of the students are Pretty Good");
            break;
            
            case 12:System.out.println("Marks of the students are Excellent");
            break;

            default:
                System.out.println("Not a valid grade !!");
        }

    }
}

public class DecisionSwitchDemo{
    
    public static void main(String[] args) {
        int marks = Integer.parseInt(args[0]);
        DecisionSwitch ds = new DecisionSwitch();
    
        ds.passStatus(marks);
    }

}
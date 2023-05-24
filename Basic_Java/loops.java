class WhileLoops{
    // Practicing While loop
    int n;
    void setN(int n1){
        n = n1;
    }
    void printTillN(){
        //Let i =1 {Initializing "i" value}
        int i = 1;
        while(i<n){
            System.out.println(i);
            i++;
        }
    }
}

class DoWhileLoops{
    int n;

    void setN(int n1){
        n = n1;
    }
    void printTillN(){
        //Let i =1 {Initializing "i" value}
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<n);
    }


}

class ForLoops{
    int n;

    void setN(int n1){
        n = n1;
    }
    void printTillN(){
        //Let i =1 {Initializing "i" value}
        for(int i = 1; i<n; i++){
            System.out.println(i);
        }
    }
}
public class loops {
    public static void main(String[] args) {
        
        System.out.println("Please Enter the \"N\" value ");
        int n = Integer.parseInt(args[0]);

        WhileLoops wl = new WhileLoops();
        System.out.println("Printing from the While Loop !!");
        wl.setN(n);
        wl.printTillN();
        System.out.println("------------------------------");
        System.out.println("Printing from the Do While Loop !!");
        DoWhileLoops dwl = new DoWhileLoops();

        dwl.setN(n);
        dwl.printTillN();
        System.out.println("------------------------------");
        System.out.println("Printing from the For Loop !!");
        ForLoops fl = new ForLoops();

        fl.setN(n);
        fl.printTillN();
        System.out.println("------------------------------");

    }    
}
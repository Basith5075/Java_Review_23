class Salary{
    int catg;
    void decidor(int c){
        if(c==1){
            catg = 1;
        }
        if(c==2){
            catg = 2;
        }
        if(c==3){
            catg = 3;
        }
    }
    void calcSalary(){
        if(catg==1){
            System.out.println("You are a fresher, Your Salary is $ 80,000\nThank You !!");
        }
        if(catg==2){
            System.out.println("You are a fresher, Your Salary is $ 100,000\nThank You !!");
        }
        if(catg==3){
            System.out.println("You are a fresher, Your Salary is $ 120,000\nThank You !!");
        }
    }
    }
    


public class SalaryEstimator{
    public static void main(String[] args) {
        if(args.length != 0){
            int choice = Integer.parseInt(args[0]);
            Salary sal = new Salary();
            sal.decidor(choice);
            sal.calcSalary();
        }else{
            System.out.println("Please Enter at least one value");
        }
    
    }
}
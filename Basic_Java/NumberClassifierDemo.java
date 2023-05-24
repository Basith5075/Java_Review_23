class NumberClass{
    int a;
    void set(int aa){
        a = aa;
    }

    void decide(){

        if(a>0){
            System.out.println("Positive Number !!");
        }else{
            if(a<0){
                System.out.println("Negative Number !!");

            }else{
                System.out.println("Zero !!");
            }
        }
    }
}

class NumberClassifierDemo{

    public static void main(String[] args) {
        if(args.length != 0){
            NumberClass nc = new NumberClass();
            int num = Integer.parseInt(args[0]);
            nc.set(num);
            nc.decide();

        }else{
            System.out.println("Please Provide Input as Cmd line args");
        }
    }
    
}
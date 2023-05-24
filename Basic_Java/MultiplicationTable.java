class Multiple{
    int n;
    void set(int n1){
        n = n1;
    }

    void table(){
        if (n<0){
            System.out.println("Please Enter a number greater than 0");
        }else{
            int i = 1;
            while(i<=10){
                System.out.println(n+" x "+i+" = "+(n*i));
                i++;
            }
        }
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        Multiple mul = new Multiple();
        mul.set(7);
        mul.table();      
    }
}

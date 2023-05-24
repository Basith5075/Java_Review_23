import tp.Test1;

class TestHere{

    void greet(){

        Test1 t1 = new Test1();
        t1.greet("Abdul Basith");
    }
    
}

public class Testing {
    public static void main(String[] args) {
        TestHere th = new TestHere();
        th.greet();
    }
}

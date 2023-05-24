abstract class Teacher{

    abstract void play();
    abstract void study();
}

abstract class LazyStudent extends Teacher{

    void play(){
        System.out.println("Lazy Student always plays. He never studies.!!");
    }
}

class GoodStudent extends LazyStudent{

    void study(){
        System.out.println("Good Student First Reads");
    }

    void play(){
        System.out.println("Good Student plays after reading !!");
    }
}

public class AbstractClassEx2 {
    public static void main(String[] args) {
        GoodStudent gs = new GoodStudent();
        gs.study();
        gs.play();

        // Teacher ls = new LazyStudent();
        // ls.play();

        // Teacher ts = new Teacher();
        // ts.play();

        Teacher ts = new GoodStudent();
        ts.study();
        ts.play();
    }
}

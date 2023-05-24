interface Teacher{
    
    String sub = "Java";
    void sub();
}

interface Company extends Teacher{

    String sub = "Java";
    void job();
}

class Student implements Company{
    
    @Override
    public void job() {
        System.out.println("Doing Job as an Engineer");
        
    }

    @Override
    public void sub() {
        
        System.out.println("Learning to get the job");
        
    }
}

class InterfaceEx1{

    public static void main(String[] args) {
        Company s = new Student();
        s.sub();
        s.job();
    }
    
}
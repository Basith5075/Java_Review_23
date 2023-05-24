package multithreading.threadcls;

class SumDemo extends Thread{
	int a = 10;
	int b = 15;
	
	SumDemo(int a, int b ){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		
		try{Thread.sleep(9000);}catch(InterruptedException e){System.out.println(e);}    

		int sum = a + b;
		System.out.println("Sum of two numbers is = "+sum);
		
	}
}
public class SumThread {
	
	public static void main(String[] args) {
		SumDemo s1 = new SumDemo(1,3);
		s1.setPriority(Thread.MIN_PRIORITY);
		s1.setName("Summing the threads");
		s1.start();
		
		SumDemo s2 = new SumDemo(1,4);
		s2.setPriority(Thread.MAX_PRIORITY);
		s2.start();
	}

}

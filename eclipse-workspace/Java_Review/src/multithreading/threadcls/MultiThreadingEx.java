package multithreading.threadcls;

public class MultiThreadingEx {
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.setName("New Thread here");
		t1.setPriority(8);
		System.out.println(t1); // getting the details of the running thread
	}
}

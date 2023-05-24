package multithreading.threadIntf;

import java.util.Scanner;

class NaturalNumbers implements Runnable{
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void run() {
		
		System.out.println("Please Enter a Valid Integer !!");
		
		int n = Integer.parseInt(scan.nextLine());
		
		if(n<0) {
			System.out.println("Please Enter a positive number greater than 0");
			
		}else {
			for(int i=1;i<=n;i++) {
				System.out.println("Numbers Printing ="+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("An Exception Occured");
				}
			}
		}
	}
}

public class PrintingNumbers {
	public static void main(String[] args) {
		Runnable n1 = new NaturalNumbers();
		
		n1.run();
		
		Thread t1 = new Thread(n1);
		t1.start();
		
	}
}

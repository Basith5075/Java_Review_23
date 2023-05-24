package multithreading.threadIntf;

import java.util.Scanner;

class Account1{
	
	int acBal = 0;
	
	synchronized void deposit(int bal) {
		acBal = acBal + bal;
		System.out.println("The Acccount Balance is = "+acBal);
	}
}

class CustomerImpl implements Runnable{
	
	public Account1 ac1;
	
	public CustomerImpl(Account1 ac) {
		ac1 = ac;
	}
	
	public void run() {
		ac1.deposit(10);
	}
}

public class AccountIntfThread {
	
	public static void main(String[] args) {
		Account1 ac1 = new Account1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of Customers:");
		int noc = Integer.parseInt(scan.nextLine());
		
		Runnable coi[] = new CustomerImpl[noc];
		
		for(int i = 0; i<noc; i++) {
			coi[i] = new CustomerImpl(ac1);
		}
		
		for(int i = 0;i<noc; i++) {
			Thread t1 = new Thread(coi[i]);
			t1.start();
		}
		
	}
}
package multithreading.threadIntf;

class Account{
	int bal = 0;
	
	synchronized void deposit(int bal) {
		this.bal = this.bal + bal;
		System.out.println("New Balance = "+this.bal);
	}
}

class Customer implements Runnable{
	
	Account ac;
	
	Customer(Account ac){
		this.ac = ac;
	}
	@Override
	public void run() {
		ac.deposit(10);	
	}
	
}
public class SynchroThreadSafety {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		Runnable cs = new Customer(ac);
		
		Thread t1 = new Thread(cs);
		
		t1.start();
		
		Runnable cs1 = new Customer(ac);
		
		Thread t2 = new Thread(cs1);
		
		t2.start();
		Runnable cs2 = new Customer(ac);
		
		Thread t3 = new Thread(cs2);
		
		t3.start();
		
	}
	
}

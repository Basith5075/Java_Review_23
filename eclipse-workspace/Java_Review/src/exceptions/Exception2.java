package exceptions;

import java.util.Scanner;

interface BankingIntf{
	
	void deposit() throws DepositException,NumberFormatException;
	void withdraw() throws WithDrawException,NumberFormatException,InsufficientFunds;
}

class DepositException extends Exception{
	
}

class WithDrawException extends Exception{
	
}
class InsufficientFunds extends Exception{
	
}

class Banking implements BankingIntf{
	Scanner scan = new Scanner(System.in);
	int acBal;
	Banking(){
		acBal = 500;
	}
	
	@Override
	public void deposit() throws DepositException,NumberFormatException {
		
		
		System.out.println("Please Enter the Amount to be deposited");
		int amt = Integer.parseInt(scan.nextLine());
		
		if(amt<0) {
			DepositException de = new DepositException();
			throw de;
		}else {
			this.acBal = this.acBal + amt;
			System.out.println("Thank You For Deposting the cash of "+amt);
			System.out.println("Your Current Total is "+this.acBal);
		}
		
	}
	
	@Override
	public void withdraw() throws WithDrawException,NumberFormatException,InsufficientFunds {
		
		System.out.println("Please Enter the Amount to be Withdrawn");
		int amt = Integer.parseInt(scan.nextLine());
		if(amt<0) {
			WithDrawException we = new WithDrawException();
			throw we;
		}else if(amt>acBal){
			System.out.println("Sorry You have Entered the amount greater than your current balance."+this.acBal);
			InsufficientFunds ifs = new InsufficientFunds();
			throw ifs;
			}
		else{		
			this.acBal = this.acBal - amt;
			System.out.println("Thank You For Withdrawing the cash of "+amt);
			System.out.println("Your Current Total is "+this.acBal);
		
		}
	}
}
public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Your Choice :");
		System.out.println("1. Deposit\n2.Withdraw");
		int ch = Integer.parseInt(scan.nextLine());
		
		BankingIntf bif = new Banking();
		
		try {
		switch (ch) {
		case 1: bif.deposit();	
			break;
		case 2 : bif.withdraw();
			break;
		default:
			break;
		}
		}catch(DepositException e) {
			System.out.println("Please Enter a Positive Amount");
		}catch(WithDrawException e) {
			System.out.println("Please Enter a Positive Amount");
		}catch(InsufficientFunds e) {
			System.out.println("You do not have sufficent balance in account");
		}catch(NumberFormatException e) {
			System.out.println("Please Enter a valid number");
		}
		
		}
	}
	


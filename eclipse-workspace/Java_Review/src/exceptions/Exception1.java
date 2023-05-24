package exceptions;

import java.util.Scanner;

class Div{
	
	Scanner scan = new Scanner(System.in);
	
	void div() {
		
		try {
		
		System.out.println("Please Enter the Number 1");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("Please Enter the Number 1");
		int num2 = Integer.parseInt(scan.nextLine());
		
		int divRes = num1/num2;
		
		System.out.println("The result of division is = "+divRes);
		
		}catch(NumberFormatException e){
			
			System.out.println("Kindly Enter an Integer value only.");
			
		}catch(ArithmeticException e){
			
			System.out.println("Kindly do not enter zero as second number");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Kindly enter exact 2 number of inputs");
			
		}finally {
			System.out.println("-------------------\nExecuting the Finally block");
		}
		
	}
	
	
}

public class Exception1 {

	public static void main(String[] args) {
		Div dv = new Div();
		dv.div();
	}
}

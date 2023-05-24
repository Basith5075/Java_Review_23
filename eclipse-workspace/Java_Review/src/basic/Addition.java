package basic;

public class Addition {
	
	
	int num1;
	int num2;
	
	private static int sumOftwo(int num1, int num2) {
		
		num1 = num1;
		num2 = num2;
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The sum of two numbers 1 and 5 is = : "+sumOftwo(1, 5));
		Subtraction subs = new Subtraction();
		subs.subtraction(1, 5);
	}
}

class Subtraction{
	public void subtraction(int num1, int num2) {
		int subt = num1 - num2;
		System.out.println("The subtraction of "+num1+" and "+num2+" is = "+subt);
	}
}

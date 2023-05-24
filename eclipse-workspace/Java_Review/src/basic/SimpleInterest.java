package basic;

import java.util.Scanner;

public class SimpleInterest {
	
	double simpleInt(double p, double t, double r) {
		
		double result = (p * t * r)/100;
		
		return result;
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Principal, Time and rate after each enters:");
		double p = Double.parseDouble(scan.next());
		double t = Double.parseDouble(scan.next());
		double r = Double.parseDouble(scan.next());
		
		SimpleInterest si = new SimpleInterest();
		
		System.out.println("The Simple Interested calculated is :"+si.simpleInt(p,t,r));
		
	}

}

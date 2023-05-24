package basic;

import java.util.Scanner;

public class Circle {

	double pi = 3.14;
	
	double areaCircle(double r) {
		double area = pi * r * r; 
		
		return area;
	}
	
	double perimeterCircle(double r) {
		
		double peri = 2 * pi * r;
		
		return peri;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter the radius of the circle for calculating its area and perimeter !!");
		
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		
		Circle c = new Circle();
		
		System.out.println("The area of Circle : "+c.areaCircle(r));
		System.out.println("The perimeter of Circle : "+c.perimeterCircle(r));
	}

}

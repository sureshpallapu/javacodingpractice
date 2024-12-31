package in.abstraction;

import java.util.Scanner;

public class square extends shape{
	Scanner s=new Scanner(System.in);
	 double a;
	@Override
	void calArea() {
		 System.out.println("enter the value of square side");
		 a=s.nextDouble();
		area=a*a;
		System.out.println("Area of Square ="+area);
		
	}
	@Override
	void perimeter() {
		double peri=4*a;
		System.out.println("perimeter of square = "+peri);
		
	}

	public static void main(String[] args) {
		square S=new square();
		S.calArea();
		S.perimeter();

	}
	
	
}

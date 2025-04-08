package in.abstraction;

import java.util.Scanner;

public class rectangle extends ShapeE {
	Scanner s=new Scanner(System.in);
	 double l,b;
	
	void calArea() {
		 System.out.println("enter the value of length");
		 l=s.nextDouble();
		 System.out.println("enter the value of breadth");
		 b=s.nextDouble();
		 area=l*b;
		System.out.println("Area of rectangle ="+area);
		
	}
	void perimeter() {
	 double peri=2*(l+b);
	 System.out.println("perimeter of rectangle =" +peri);
	}
	public static void main(String[] args) {
		rectangle R=new rectangle();
		R.calArea();
		R.perimeter();
	


	}

}

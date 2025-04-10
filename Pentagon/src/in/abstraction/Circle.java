package in.abstraction;

import java.util.Scanner;

public class Circle extends ShapeE {
	Scanner s = new Scanner(System.in);
	double r;

	void calArea() {

		System.out.println("enter the value of radius");
		r = s.nextDouble();
		area = PI * r * r;
		System.out.println("Area of circle =" + area);

	}

	void perimeter() {
		double peri = 2 * PI * r;
		System.out.println("Ciecumference of circle= " + peri);
	}

	public static void main(String[] args) {

		Circle c = new Circle();
		c.calArea();

	}

}

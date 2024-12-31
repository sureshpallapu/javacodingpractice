package in.abstraction;

public  abstract class shape {
    double area;
    final double PI=3.14;
  
	abstract void calArea();
	abstract void perimeter();
    void displayArea() {
    	System.out.println(" area of the shape ");
    }
}

package in.inheritance;

public class staticMethod{
	int a,b;
	static int  x,y;
	staticMethod(){
		a=10;b=20;
		x=100;y=200;
		System.out.println("con....exe....");
	}
	void m(){
		System.out.println("nonstaticmethd");
	}
	static void m1(){
		System.out.println("nonstaticmethd");
	}
	{
		a=10;b=20;
		System.out.println(a+" "+b+" "+x+" "+y );
		System.out.println("IB exe....");
	}
	static {
		
		
		System.out.println("SR exee.....");
	}

	
	
	public static void main(String[] args) {
		
	
		
	
	}
	
	static class demo{
		
	}
	}

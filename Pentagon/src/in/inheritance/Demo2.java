package in.inheritance;

public class Demo2 {
	int a,b;
	static int x,y;
	Demo2(){
		System.out.println("const....exe....");
	}
void m() {
	 int z=10000;
	System.out.println(a+" "+b);
	System.out.println(x+" "+y);
}
	public static void main(String[] args) {
		Demo2 d1,d2;
		d1=new Demo2();
		d2=new Demo2();
		d1.m();
		
		System.out.println(x+""+y);
	
		
	}

}


package Exception;

import java.util.Scanner;

public class Demo {
	public static void main(String [] args)
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Boy age");
	 int Bage;
	 Bage=s.nextInt();
	 System.out.println("Enter Girl age");
	 int Gage;
	 Gage=s.nextInt();
	 try {
		 if(Bage>21 && Gage>18) {
			 System.out.println("Both boy with age "+Bage +" and " + "girl with age " + Gage+ "are eligible to marriage ");
		 }
		 else {
			 Agelessthantomarriage a=new  Agelessthantomarriage();
			 throw a;
		 }
	 }
	 catch (Exception e) {
		 System.out.println();
		 
	 }

}
}
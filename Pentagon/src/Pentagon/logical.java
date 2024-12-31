package Pentagon;

import java.util.Scanner;


public class logical {

	public static void main(String[] args) {
		double mockRate;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mock rating");
		mockRate=s.nextDouble();
		System.out.println(mockRate);
		
		if(mockRate<=10 && mockRate>=8.5)
			System.out.println("eligible for first priority drives");
		else if(mockRate>=6.5 && mockRate<=8.5)
			System.out.println("eligible for drives");
		else if(mockRate>=1 && mockRate<=6.5)
			System.out.println("not eligible for drives");
				
		
		
	}

}

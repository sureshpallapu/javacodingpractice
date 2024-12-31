package Pentagon;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		double percent;
		Scanner s=new Scanner(System.in);
		System.out.println("enter student percent");
		percent=s.nextDouble();
		System.out.println("Student percentage is "+percent);
		
		if(percent<=100 && percent>=85)
			System.out.println("Student qualified distinction");
		else if(percent>=70 && percent<=85)
			System.out.println("Student passed in first class");
		else if(percent>=55 && percent<=70)
			System.out.println("Student passed in second class");
		else if(percent>=35 && percent<=55)
			System.out.println("Student passed in third class");
		else if(percent<35)
			System.out.println("Student is failed");
		else
			System.out.println("enter valid input");
			
 
	}

}

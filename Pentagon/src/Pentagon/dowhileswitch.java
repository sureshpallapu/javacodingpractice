package Pentagon;

import java.util.Scanner;

public class dowhileswitch {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		int a=1;
		do {
			System.out.println("enter the day 1 to 7");
			int day=s.nextInt();
			switch (day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wedenday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
			default:
				System.out.println("invalid input");
	    }
			a++;
		}while(a<=7);
	}

}

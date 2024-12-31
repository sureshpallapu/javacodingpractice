package Pentagon;

import java.util.Scanner;

public class Switchex {

	public static void main(String...args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the month (format should be first 3 letters of a month in lower case) ");
		String month=s.nextLine();
		System.out.println("the month is  "+month);
		switch (month) {
		case "jan": 
			System.out.println("jan has 31 days");
			break;
		case "feb": 
			System.out.println("jan has 28/29 days");
			break;
		case "mar": 
			System.out.println("jan has 31 days");
			break;
		case "apr": 
			System.out.println("jan has 30 days");
			break;
		case "may": 
			System.out.println("jan has 31 days");
			break;
		case "jun": 
			System.out.println("jan has 30 days");
			break;
		case "jul": 
			System.out.println("jan has 31 days");
			break;
		case "aug": 
			System.out.println("jan has 31 days");
			break;
		case "sep": 
			System.out.println("jan has 30 days");
			break;
		case "oct": 
			System.out.println("jan has 31 days");
			break;
		case "nov": 
			System.out.println("jan has 30 days");
			break;
		case "dec": 
			System.out.println("jan has 31 days");
			break;
		
		default:
			System.out.println("enter valid month format");
			break;
		}
	
	}

}

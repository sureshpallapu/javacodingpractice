package Exception;

import java.util.Scanner;

public class MobileNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("enter mobile number");
	    long  mobileNumber;
	    mobileNumber=s.nextLong();
	    try {
	    	if(mobileNumber != 0 || mobileNumber<=1999999999 ){
	    		
	    		System.out.println(" number is valid ");
	    		
	    	}
	    	else {
	    		throw new InvalidNumber("mobile number is invalid");	    		
	    	}
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }	
}
}

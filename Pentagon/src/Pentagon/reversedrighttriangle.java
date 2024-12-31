package Pentagon;

import java.util.Scanner;

public class reversedrighttriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		  for (int i = n; i >= 1; i--) {  
	            for (int j = 1; j <= n - i; j++) { 
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*"+" ");
	                
	                
	            }
	            System.out.println();
	        }
	}

}

package Pentagon;

import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {
		int i,j,k;
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();  
		int space = n - 1;  
		for (j = 1; j<=n; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= n - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (n - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
	}

}

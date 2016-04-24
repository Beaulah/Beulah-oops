package reversenumb;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Declare variables
		
		int rev=0;
		int n;
		//Intiate variables
		System.out.println("Enter a value:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		{
			while( n != 0 )
		      {
		          rev = rev * 10;
		          rev = rev + n%10;
		          n = n/10;
		      }
		 
		      System.out.println("Reverse of entered number is "+rev);
		   }
		}
		
				
		

	}



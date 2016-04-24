package scanner;
import java.util.Scanner;

class PrimeNumber
{
		public static void main(String args[])
		{
	
	int a;
	boolean flag=true;
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value:");
	a=scan.nextInt();
	for(int i=2;i<=a/2;i++)
	{
		int d;
		d=a%i;
		if(d==0)
		{
			flag=false;
			break;
		}
	}
		
		if(flag)
		
			System.out.println(a+ "is an primenumber");
		
		else
	
			System.out.println(a +"is not an Primenumber");
		}
}
	
		
	
		
		

			
		
	
	
					
			

		
			
			
					
			
		
	
	
	
		
	
	



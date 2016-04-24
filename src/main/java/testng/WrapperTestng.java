package testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class WrapperTestng {

	@BeforeClass
		public void launchbrowser()
		{
			System.out.println("browser launched");
		}
	 @BeforeMethod
		public void login()
		{
			System.out.println("logged in successfully");
		
		System.out.println("crm click");
		
		System.out.println("create lead opened");
		}
	@AfterClass
		public void closebrowser()
		{
			System.out.println("close bowser");
		}
	}
	 
	 
	 



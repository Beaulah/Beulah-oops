package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



@SuppressWarnings("unused")
public class TestCasesCommon extends GenericWrappers {
	@Parameters({"browser"})
@BeforeSuite
  		public void launchbrowser()
  		{
	  launchapp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
  
	
	  enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByXpath("//div[@class='crmsfa']/a/img");
  	
  		}
  	@AfterTest
  		public void closebrowser()
  		{
  			System.out.println("close bowser");
  		}
  	}
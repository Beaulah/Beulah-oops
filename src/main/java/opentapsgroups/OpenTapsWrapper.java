package opentapsgroups;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class OpenTapsWrapper {
	@Parameters({"browser"})
           @BeforeClass(groups={"smoke","sanity"})
			public void launchbrowser(String browsername)
			{
				System.out.println("browser launched");
				System.out.println("Launched in "+ browsername);
			}
		 @BeforeMethod(groups={"smoke","sanity"})
			public void login()
			{
				System.out.println("logged in successfully");
			
			System.out.println("crm click");
			
			System.out.println("create lead opened");
			}
		@AfterClass(groups={"smoke","sanity"})
			public void closebrowser()
			{
				System.out.println("close bowser");
			}
		
		}



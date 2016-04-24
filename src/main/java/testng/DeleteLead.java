package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DeleteLead extends WrapperTestng {
	
	 @Test(dependsOnMethods="testng.CreateLeads",timeOut=10000)
	  public void Deletelead() {
		  System.out.println("lead deleted");
		  
	  }
	  @AfterMethod
	  public void verify(){
		  System.out.println("verified lead deleted");
	  }
	}
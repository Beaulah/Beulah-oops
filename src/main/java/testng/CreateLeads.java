package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateLeads extends WrapperTestng {
	
	
  @Test(invocationCount=2,threadPoolSize=2)
  public void Createlead() {
	  System.out.println("lead created");
	  
  }
  @AfterMethod
  public void verify(){
	  System.out.println("verified lead created");
  }
}

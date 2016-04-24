package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditLead extends WrapperTestng {
	  @Test(dependsOnMethods="CreateLeads")
	  public void Editlead() {
		  System.out.println("lead edited");
		  
	  }
	  @AfterMethod
	  public void verify(){
		  System.out.println("verified lead edited");
	  }
	}

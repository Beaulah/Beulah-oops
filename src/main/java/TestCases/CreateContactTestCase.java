package TestCases;

import org.testng.annotations.Test;

public class CreateContactTestCase extends TestCasesCommon {
  @Test
  public void createcontact() {
	  clickByLinkText("/crmsfa/control/createContactForm");
	
	  enterByXpath("//input[@id='firstNameField']","sara");
	  enterByXpath("//input[@id='lastNameField']","baby");
	  clickByClassName("smallSubmit");
	  System.out.println("contact created");
	  
	  
  }
}

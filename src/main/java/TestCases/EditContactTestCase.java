package TestCases;

import org.testng.annotations.Test;

public class EditContactTestCase extends TestCasesCommon {
  @Test(priority=5)
  public void editcontact() {
	  clickByXpath("//a[@class='subMenuButtonDangerous']/../a");
	  enterByXpath("//input[@id='firstNameField']","");
	  enterByXpath("//input[@id='firstNameField']","babysara");
	  clickByClassName("smallSubmit");
	  System.out.println("contact edited");
  }
}

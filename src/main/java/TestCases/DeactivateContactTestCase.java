package TestCases;

import org.testng.annotations.Test;

public class DeactivateContactTestCase extends TestCasesCommon {
  @Test(priority=2)
  public void deactivatecontact() {
	  clickByXpath("//a[@class='subMenuButtonDangerous']"); 
	  acceptAlert();
	  System.out.println("contact deactivated");
  }
}

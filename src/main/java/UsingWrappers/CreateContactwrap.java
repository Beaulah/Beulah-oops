package UsingWrappers;


import org.junit.Test;





public class CreateContactwrap extends Wrapp {
	@Test
	public void login() throws InterruptedException
	{
		launchApp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		verifyUrl("http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		submitByClassName("decorativeSubmit");
		clickByXpath("//div[@class='crmsfa']/a/img");
		Thread.sleep(5000);
		clickByXpath("//ul[@class='shortcuts']/li[3]/a");
		enterTextByXpath("//input[@id='firstNameField']","sara");
		enterTextByXpath("//input[@id='lastNameField']", "pricy");
		submitByClassName("smallSubmit");
	}

}

import org.openqa.selenium.firefox.FirefoxDriver;



public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		//*Launch browser"
		driver.get("http://demo1.opentaps.org");
//*Verify url
		driver.getCurrentUrl().contentEquals("http://demo1.opentaps.org");
		driver.getTitle().contentEquals("/opentaps_images/opentaps_logo.png");
		
		//*Maximize the Browser*//
driver.manage().window().maximize();
		Thread.sleep(5000);
//*enter the Username*//
driver.findElementById("username").sendKeys("DemoSalesManager");
		//*enter password*//
driver.findElementById("password").sendKeys("crmsfa");

		//*Click Submit*/
driver.findElementByClassName("decorativeSubmit").submit();
driver.findElementByXPath("//div[@class='crmsfa']/a/img").click();
Thread.sleep(5000);
driver.findElementByXPath("//ul[@class='shortcuts']/li[3]/a").click();

//Create contact//
	driver.findElementByXPath("//input[@id='firstNameField']").sendKeys("sara");
	driver.findElementByXPath("//input[@id='lastNameField']").sendKeys("pricy");
	driver.findElementByClassName("smallSubmit").submit();
	

	
}

}

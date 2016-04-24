package UsingWrappers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class LoginopenTaps extends Wrapp {

	@Test
	public void login() {

		/*
		 * FirefoxDriver driver=new FirefoxDriver();
		 * driver.get("http://demo1.opentaps.org/opentaps/control/main");
		 * driver.manage().window().maximize();
		 */

		launchApp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		
		//*enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		driver.findElementByXPath("//div[@class='nav-search-field'/input");//*

	}
	
	
			}
		
				
		



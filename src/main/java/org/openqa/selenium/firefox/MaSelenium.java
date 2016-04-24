package org.openqa.selenium.firefox;
import java.util.concurrent.TimeUnit;
import java.util.NoSuchElementException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaSelenium {

	public static void main(String[] args) throws InterruptedException {
		//*Creating reference for package firefox driver*//
		FirefoxDriver driver=new FirefoxDriver();
		//*Launch browser"
		driver.get("http://demo1.opentaps.org");
		//*Maximize the Browser*//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//*enter the Username*//
		driver.findElementById("Username").sendKeys("DemoSalesManager");
		//*enter password*//
		driver.findElementById("Password").sendKeys("crmsfa");
		//*Click Submit*/
		driver.findElementByClassName("Login").click();
		//*Click Logout*//
		driver.findElementByXPath("[@id='logout']/input").click();
		//*Close the browser*//
		driver.close();
	}


		
		
		
		
		
		
		
	}



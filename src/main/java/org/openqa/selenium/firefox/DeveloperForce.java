package org.openqa.selenium.firefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DeveloperForce
{

	public static void main(String[] args) throws Exception {
		//Creating referene fo the class//
		WebDriver driver=new FirefoxDriver();
		//launch the browser//
		driver.get("https://developer.salesforce.com");
		//maximize the browse*//
		driver.manage().window().maximize();
		/*Wait for seconds*/
		
		/*Clik signup*/
		driver.findElement(By.className("Sign Up")).click();
		driver.findElement(By.id("first_name")).sendKeys("Beaulah");
		driver.findElement(By.id("last_name")).sendKeys("Kerenhap");
		driver.findElement(By.id("email")).sendKeys("beaulahkerenhap@gmail.com");
		Select St=new Select(driver.findElement(By.id("job_role")));
		St.selectByIndex(3);
		driver.findElement(By.id("company")).sendKeys("CSC");
		 St=new Select(driver.findElement(By.id("country")));
		St.selectByIndex(7);
		driver.findElements(By.id("postal_code"));
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("bkeren@csc.com");
		driver.findElement(By.id("eula")).click();
		driver.findElement(By.id("submit_btn")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

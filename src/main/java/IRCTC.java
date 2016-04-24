package org.openqa.selenium.firefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.linkText("/eticketing/userSignUp.jsf")).click();
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("Beaulah");
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Lorenzo@22");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("Lorenzo@22");
		Select St=new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		St.selectByIndex(3);
		driver.findElements(By.id("userRegistrationForm:securityAnswer"));
		Select St=new Select(driver.findElement(By.id("userRegistrationForm:prelan")));
		St.selectByIndex(0);
		driver.findElement(By.id("userRegistrationForm:firstName"));
		driver.findElements(By.id("userRegistrationForm:middleName"));
		driver.findElement(By.id("userRegistrationForm:lastName"));
		
		
		
		
		

	}

}

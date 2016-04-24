package homeworktwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTwo {

	public static void main(String[] args) throws InterruptedException {
		//*Set Chome Browser*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//*Launch*//
		ChromeDriver driver=new ChromeDriver();
		//*get url*//
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.name("q"));
		
		//*Select link which we opted*
		for (WebElement red : links) 
		{
			red.sendKeys("Beaulah");
				red.submit();
				
			}
		}
	}



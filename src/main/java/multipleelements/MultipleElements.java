package multipleelements;

import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




@SuppressWarnings("unused")
public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		//*setting the browser/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch //
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		//to create list//
		Thread.sleep(5000);
		
		List<WebElement> links=driver.findElementsByTagName("a");
		//*Select link which we opted*
		for (WebElement red : links) 
		{
			if((red.getText().contains("c")) && (red.getLocation().getX()>50) && (red.getSize().getWidth()>20))
			{
				red.click();
				System.out.println("The link is::"+red.getAttribute("href"));
				break;
			}
					
					
			
		}
	}
}
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	



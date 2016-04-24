package framesnumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNumber {

	public static void main(String[] args) {
		//intialize it//

		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		//List of frames//
		List<WebElement> myIframes= driver.findElements(By.tagName("iframe"));
		myIframes.size();
		


	}

}

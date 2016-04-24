
	package UsingWrappers;

	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;

	public class Wrapp {
		RemoteWebDriver driver;
//launch app//
		public void launchApp(String browser, String url) {

			try {
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}

				// "http://demo1.opentaps.org/opentaps/control/main"
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (WebDriverException e) {
				System.out.println("Application could not be launched !!");
			}
		}
//entertextbyid//
		public void enterTextById(String id, String value) {
			try {
				driver.findElement(By.id(id)).clear();
				driver.findElement(By.id(id)).sendKeys(value);
			} catch (NoSuchElementException e) {
				System.out.println("The element with id : " + id + " could not be found !!");
			}
		}
		//Click by class name//

		public void clickByClassName(String className) {
			try {

				driver.findElement(By.className(className)).click();
			} catch (NoSuchElementException e) {
				System.out.println("The element with className : " + className + " could not be found !!");
			}
		}
		//Submit by classname//
			public void submitByClassName(String className) {
				try {

					driver.findElement(By.className(className)).submit();
				} catch (NoSuchElementException e) {
					System.out.println("The element with className : " + className + " could not be found !!");
				}
			}
			//click ByXpath
				public void clickByXpath(String xpath) {
					try {

						driver.findElement(By.xpath(xpath)).click();
					} catch (NoSuchElementException e) {
						System.out.println("The element with className : " + xpath + " could not be found !!");
					}
		}
				
			//enter text by xpath//
				public void enterTextByXpath(String xpath, String value) {
					try {
						driver.findElement(By.xpath(xpath)).clear();
						driver.findElement(By.xpath(xpath)).sendKeys(value);
					} catch (NoSuchElementException e) {
						System.out.println("The element with id : " + xpath + " could not be found !!");
					}
				}
//Verify url//
				public void verifyUrl(String url){
					try{
						if(driver.getCurrentUrl().contentEquals(url)){
						System.out.println("Verifiedurl"+ url);
					}
					else
					{
						System.out.println("Incorrect url"+url);
					}
					}
						catch(WebDriverException e){
							System.out.println("Page not found");
				}
				}
//verify title//
					public void verifyTitle(String title){
						try{
							if(driver.getTitle().contentEquals(title)){
								System.out.println("Verifiedtitle"+title);
							}
							else
							{
								System.out.println("Incorrect title"+title);
							}
						}
						catch(WebDriverException e){
							
							System.out.println("page not found");
							}
						}
					
	
	
	//verify text//
	public void verifyText(String text){
		try{
			if(driver.getPageSource().contains(text)){
				System.out.println("VerifiedText"+text);
			}
			else
			{
				System.out.println("Incorrect Text"+text);
			}
		}
		catch(WebDriverException e){
			
			System.out.println("page not found");
			}
		}
	public void switchToFrame(int frame) {
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to frame with id " + frame);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + frame
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with id " + frame
					+ e.getStackTrace());
		}
	}
	}
	
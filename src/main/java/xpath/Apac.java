package xpath;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



@SuppressWarnings("unused")
public class Apac {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		FileInputStream fis=new FileInputStream(new File("./Amazon.xlsx"));
		
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//Move to sheetlevel//	
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//print total row//
		System.out.println("total row:"+sheet.getLastRowNum());
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
			//Move to curent row//
			XSSFRow currentRow = sheet.getRow(1);
			String cell = currentRow.getCell(0).getStringCellValue();
			driver.findElementByXPath("//div[@class='nav-search-field']/input").sendKeys(cell);
			driver.findElementByXPath("//span[@class='nav-search-submit-text nav-sprite']").submit();
			
			
			driver.findElementByXPath("//li[@id='result_2']/div/div/div/div/div/div/a").click();
			System.out.println("Index");		}
	
		
		
	}

				
		
		
		
			
			
		
		
	

	
	


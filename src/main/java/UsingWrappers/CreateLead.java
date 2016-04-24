package UsingWrappers;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.firefox.FirefoxDriver;


@SuppressWarnings("unused")

public class CreateLead extends Wrapp {
	@Test

	public void login()
	{
		launchApp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		submitByClassName("decorativeSubmit");
		clickByXpath("//div[@class='crmsfa']/a/img");
		clickByXpath("//div[@class='frameSectionBody']/ul/li/a");

		//fill details//submit//
		enterTextById("createLeadForm_companyName", "Virtusa");
		enterTextById("createLeadForm_firstName", "bea");
		enterTextById("createLeadForm_lastName", "jack");
		submitByClassName("smallSubmit");
		
		
		
		
		
		
		
	}
		
	
				
		
		
			
			
			
			
	}



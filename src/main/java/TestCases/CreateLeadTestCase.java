package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import opentapsgroups.OpenTapsWrapper;

@SuppressWarnings("unused")

public class CreateLeadTestCase extends TestCasesCommon {
	@Test
	public void Createlead(){
	
	  
		clickByXpath("//div[@class='frameSectionBody']/ul/li/a");
		

		enterById("createLeadForm_companyName", "Virtusa");
			enterById("createLeadForm_firstName", "bea");
			enterById("createLeadForm_lastName", "jack");
			clickByClassName("smallSubmit");

		
			 System.out.println("lead created");
}
}
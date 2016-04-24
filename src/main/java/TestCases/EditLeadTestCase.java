package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class EditLeadTestCase extends CreateLeadTestCase{
@Test

  public void editlead() {
	  
		//edit lead//
	 clickByXpath("//a[@href='javascript:document.qualifyLeadForm.submit()']/../a[3]");

		
	 enterById("updateLeadForm_firstName"," ");
	
	 enterById("updateLeadForm_firstName","rishim");
	
	 clickByXpath("//form[@action='/crmsfa/control/updateLead']/input/../div/div/table/tbody/tr[12]/td[2]/input");



		 System.out.println("lead edited");
  }
}

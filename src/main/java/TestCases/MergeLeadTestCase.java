package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


@SuppressWarnings("unused")
public class MergeLeadTestCase extends GenericWrappers  {

	@Test
	public void merge() throws IOException {
		readCellFromExcel("Mergelead", 1, 1);
		
//		read from excel
		
		
		String dataSheetName = "Mergelead";
		String username = readCellFromExcel(dataSheetName , 1, 1);
		String password = readCellFromExcel(dataSheetName, 1, 2);
		String fromLeadId = readCellFromExcel(dataSheetName, 1, 3);
		String toLeadId = readCellFromExcel(dataSheetName, 1, 4);
		
		
//		use opentaps  wrapper to login
launchapp("firefox", "http://demo1.opentaps.org/opentaps/control/main");

	  
		
  		
  		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		
		clickByXpath("//div[@class='crmsfa']/a/img");
		clickByLinkText("Leads");
		
		// Click Merge lead
		clickByLinkText("Merge Leads");
		clickByXpath("//img[@alt='Lookup']");

		// switch to window
		switchToLastWindow();
		// find lead1
//		enterByXpath("Lead ID", "//label[text()='Lead ID:']/../div/input");
		enterByXpath("//label[text()='Lead ID:']/../div/input", fromLeadId);
		clickByXpath("//button[text()='Find Leads']");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		switchToPrimaryWindow();
		
		clickByXpath("//img[@alt='Lookup']");

		switchToLastWindow();
		enterByXpath("//label[text()='Lead ID:']/../div/input", toLeadId);
//		enterByXpath("Lead ID", "//label[text()='Lead ID:']/../div/input");
		clickByXpath("//button[text()='Find Leads']");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		switchToPrimaryWindow();
		
		clickByClassName("buttonDangerous");
		acceptAlert();
		// Search for 1st lead//
		clickByLinkText("Find Leads");
		
		
//		change
		enterByXpath("//label[text()='Lead ID:']/../div/input", fromLeadId);
		clickByXpath("//button[text()='Find Leads']");
		
	}
}


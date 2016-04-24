package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class DeleteLeadTestCase extends EditLeadTestCase{
	@Test(dependsOnMethods="editlead")
  public void deletelead(){
	  
	  
		 //deletelead//
		clickByClassName("subMenuButtonDangerous");
		
		 System.out.println("Lead deleted");
		 
  }
}

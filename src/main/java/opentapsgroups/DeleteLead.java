package opentapsgroups;


import org.testng.annotations.Test;



public class DeleteLead extends OpenTapsWrapper {
	
	 @Test(groups="sanity",dependsOnGroups="smoke")
	  public void Deletelead() {
		  System.out.println("lead deleted");
		  
	  }
	  
	}
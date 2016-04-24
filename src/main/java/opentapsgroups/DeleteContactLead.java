package opentapsgroups;


import org.testng.annotations.Test;



public class DeleteContactLead extends OpenTapsWrapper {
	
	 @Test(groups="sanity",dependsOnGroups="smoke")
	  public void DeleteNewlead() {
		  System.out.println("contact lead deleted");
		  
	  }
	  
	}
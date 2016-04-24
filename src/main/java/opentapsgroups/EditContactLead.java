package opentapsgroups;


import org.testng.annotations.Test;



public class EditContactLead extends OpenTapsWrapper {
	
	  @Test(groups="sanity",dependsOnGroups="smoke")
	  public void EditNewlead() {
		  System.out.println("contact lead edited");
		  
	  }
	}


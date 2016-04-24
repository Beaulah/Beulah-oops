package opentapsgroups;


import org.testng.annotations.Test;



public class EditLead extends OpenTapsWrapper {
	
	  @Test(groups="sanity",dependsOnGroups="smoke")
	  public void Editlead() {
		  System.out.println("lead edited");
		  
	  }
	}


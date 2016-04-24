package opentapsgroups;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends OpenTapsWrapper {
	
	  @Test(groups="smoke",dataProvider="details")
	  public void Createlead(String username, String password, String companyName, String firstName, String lastName) {
		  System.out.println("lead created:" +username+password+companyName+firstName+lastName);
		  
	  }
		  
		  @DataProvider(name="details")
			
		  public Object[][] getUserDetails(){
		  		
		  		
		  Object[][] data = new Object[2][5];
				
			  
		  		
		  data[0][0] = "Beaulah";
		  		
		  data[0][1] = "abcd";
		  		
		  data[0][2] = "csc";
		  data[0][3] = "beau";
		  data[0][4] = "keren";
		  
		  data[1][0] = "varsha";
		  data[1][1] = "hijk";
		  data[1][2] = "csc";
		  data[1][3] = "varu";
		  data[1][3] = "upadhyaya";
		  return data;
	
	  }
	}

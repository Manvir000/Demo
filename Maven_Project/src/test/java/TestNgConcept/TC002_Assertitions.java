package TestNgConcept;

import org.testng.annotations.Test;

import org.testng.Assert;


public class TC002_Assertitions {
	
	@Test
	public void Assertitions() {
	
		//String name1 = "manvir", name2= "kaur";
		//Assert.assertEquals(name1, name2, "Actual os not eqaual to expected");
	
		int a1= 200, a2= 200;
		Assert.assertEquals(a1, a2, "No are not matching");
	   System.out.println("No are  matching");
		
		
		
		
	}

}

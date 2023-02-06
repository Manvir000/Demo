package Salenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseTest;

public class TC006_Handlinglinks {

	public static WebDriver driver = null;
	
	
	public static void main(String[] args) throws InterruptedException {
		 String elink ="Cancel";
		 boolean status =true;
		
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
		// open the application
		
		driver.get("http://facebook.com");
        //1. Click on the link
		driver.findElement(By.linkText("Forgot password?")).click();
		
		/*Thread.sleep(5000);
		
		// Clicking on browser back button
		
		driver.navigate().back();
		 // click on browser forward button
		
		Thread.sleep(5000);
		//driver.navigate().forward();
		
		//clicking on referh button
		
		driver.navigate().refresh();*/
		
		//2. capture the link name
		
		/*String LinkText = driver.findElement(By.linkText("Forgot password?")).getText();
		
		System.out.println("Link name is "+ LinkText );*/
		
		//3. Link is displayed
     	//4. Count number of links
		
		List<WebElement> Link =  driver.findElements(By.tagName("a"));
		int nooflinks = Link.size();
		
		System.out.println("Number of links are"+ nooflinks);
		
		//5. Get all the link names
		
		for(int i =0; i < nooflinks; i++) {
			
			String Linkname = Link.get(i).getText();
			
			// to skip the empty links
			
			if(!(Linkname.isEmpty())) {
				
			System.out.println("Name of links is "+ Linkname +" " );
			
		//6. Check if 1 link is present in multiple links 
	
	    if(Linkname.equalsIgnoreCase(elink)) {
	    	
	    	//System.out.println("Pass -----> link is present");
	    	status =true;
	    	
	    	break;
	    }
	    	
	    	else {
	    		status=false;
	    		//System.out.println("Fail -----> link is not present");
	    		
	    	}
			
	    
	    if(status == true)
	    {
	    	System.out.println("Pass -----> link is present");
	    }
	    
	    else {
	    	
	    	System.out.println("Fail -----> link is not present");
	    }
		}
	}
	}
}



		



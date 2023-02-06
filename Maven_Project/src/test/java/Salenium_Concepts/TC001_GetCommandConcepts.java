package Salenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_GetCommandConcepts {

	public static void main(String[] args) throws InterruptedException {
		// Setup the browser in selenium
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//open chrome browser for selenium
		
		driver.manage().window().maximize(); // to maximize the  browser window 
	    driver.get("https://phptravels.com/demo");// to open the application
		
	    // to get the URL of the application
	    
	    String appURL = driver.getCurrentUrl();
	    System.out.println("Application URL is  " + appURL);
	    
	    // Checking if the URL contains particular string 
	    
	    if(appURL.contains("phptravels"))
	    	
	    {
	    	System.out.println("URL contains the Phptravels text");
	    	
	    }
	    else 
	    {
	    	System.out.println("URL doenot contains the text Phptravels");
	    }
	    
	    // Capturing application title
	    
	    String apptitle = driver.getTitle();
	    System.out.println("title of application is" + apptitle);
	    
	    // Check if the expected application is opened.
	    
	    if(apptitle.equalsIgnoreCase("Book Your Free Demo Now - Phptravels"))
	    {
	    	System.out.println("corrcet application is opened");
	    	
	    }
	    else 
	    {
	    	System.out.println("Incorrcet application is opened");
	    }
	    
	    Thread.sleep(5000);
	    driver.close(); // close the application
	      
	    
	}

}

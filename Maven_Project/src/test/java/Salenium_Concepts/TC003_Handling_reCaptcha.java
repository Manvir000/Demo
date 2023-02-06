package Salenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_Handling_reCaptcha {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://phptravels.org/login");
     
     
     driver.findElement(By.id("inputEmail")).sendKeys("user@phptravels.com");
     driver.findElement(By.id("inputPassword")).sendKeys("demouser");
    
     Thread.sleep(5000);
     //driver.findElement(By.id("inputEmail")).clear(); 
     
    boolean status = driver.findElement(By.id("inputEmail")).isEnabled();
    System.out.println(status);
    
    if(status == true)
    {
    	System.out.println("Input field is enabled");
    	
    	
    }
     
     else
     {
    	 System.out.println("Input field is disabled");
     }
     
    new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked)));
    
    //xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"))); 

    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#recaptcha-anchor"))).click(); 
   
	}//*[@id="#divDynamicRecaptcha1"]
	//#recaptcha-anchor > div.recaptcha-checkbox-checkmark
	//#recaptcha-anchor

}


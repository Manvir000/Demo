package Salenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_HandlingButtons {

	public static WebDriver driver =null;
	
	public static void main(String[] args){
		
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("chrome");
		
	     driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=PQl64WcwKgISokvmJAraAcWIL%252FqVgGm8LJDHpNRKfXHaSw3zV9AffKIRZnPMejV%252BwazxtE6cRWuyjtp9ZQVcWOH5%252BsfZUKFat6xHUe56eMAHWUk%252BQ0kZHLLMsn00GR7f2%252FvFB5EXfkOKkvQcRG5kTquNkvyclaSI5xNcD7nWn4vXjeg2jLIIW0DOC7MY4ma48sYwTM9p6SrRGV8PYZ7TjUYtAvBaMiRQyJKVb%252B2UrW7RAsJ8RGzvJjJDuNMHNL5m3eOUuyh%252Bh6%252BGrKv5v8%252FlLUePw9LxVxO0XzS%252BVKUKrfxlKCBfey5jHUto%252FgWMwykM");
	     
	     TC004_HandlingButtons objref =new TC004_HandlingButtons();
	     objref.entervalueintextfield(driver.findElement(By.name("username")),"Username", "manvirdeol93@gmail.com");
	     objref.entervalueintextfield(driver.findElement(By.name("password")),"Password", "MK19930716@deol");
	   
	     
	     // driver.findElement(By.name("username")).sendKeys("manvirdeol93@gmail.com");
	    // driver.findElement(By.name("password")).sendKeys("MK19930716@deol");
	   // driver.findElement(By.className("GSYpm")).click();
	    
	     
	   /* boolean status = driver.findElement(By.id("username")).isEnabled();
	    System.out.println(status);
	    
	    if(status == true)
	    {
	    	System.out.println("Input field is enabled");
	    	
	    	
	    }
	     
	     else
	     {
	    	 System.out.println("Input field is disabled");
	     } */
	     
	    
		}
	     public void entervalueintextfield(WebElement ele,String textfieldname , String ValToenter ) {
	    	 
	    	ele.clear();
	    	ele.sendKeys(ValToenter);
	    	
	    	String Valentred= ele.getAttribute("Value");
	    	System.out.println("Value entered in -"+ textfieldname+ " is "+ Valentred );
	    	 
	    	 
	     }
	     
	     }

	


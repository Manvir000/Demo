package Salenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Handlingfields {

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
     
    
	}

}

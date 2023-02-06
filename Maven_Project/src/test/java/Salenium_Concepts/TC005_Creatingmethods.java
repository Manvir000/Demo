package Salenium_Concepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_Creatingmethods {

	 public static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("chrome");
		
			    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// to open the application
				
			    //driver.findElement(By.name("username")).sendKeys("Admin");
			    // driver.findElement(By.name("password")).sendKeys("admin123");
			   driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
			    
			    
			    // to get the URL of the application
			    
			    String appURL = driver.getCurrentUrl();
			    System.out.println("Application URL is  " + appURL);
			    
			    // Checking if the URL contains particular string 
			    
			    if(appURL.contains("orangehrm"))
			    	
			    {
			    	System.out.println("URL contains the orangehrm text");
			    	
			    }
			    else 
			    {
			    	System.out.println("URL doenot contains the text orangehrm");
			    }
			    
			    // Capturing application title
			    
			    String apptitle = driver.getTitle();
			    System.out.println("title of application is" + apptitle);
			    
			    // Check if the expected application is opened.
			    
			    if(apptitle.equalsIgnoreCase(apptitle))
			    {
			    	System.out.println("corrcet application is opened");
			    	
			    }
			    else 
			    {
			    	System.out.println("Incorrcet application is opened");
			    }
			    
			    Thread.sleep(5000);
			   
			driver = bt.closebrowser();
			    
			   	}
	
	 public void selectvalurfromddmenu(WebElement ele,int indexno,String dropdwnname) {
		
		 Select select = new Select(ele);
		 select.selectByIndex(indexno);
		 
		 System.out.println("Value in selected from" +dropdwnname);
		
	}
	
     public void selectvalurfromddmenu(WebElement ele,String val,String dropdownname) {
		Select select =new Select(ele);
		select.selectByValue(val);
		System.out.println("Value in selected from" +dropdownname);
		
		
	}
     
     public void checkvalindd(WebElement ele, String Val, String DDname) {
    	 
    	 boolean Status= true;
    	 Select select =new Select(ele);
    	 List<WebElement> ddVal = select.getOptions();
    	int noofval= ddVal.size();
    	for (int i = 0; i < noofval; i++) {
    		String DDValue =ddVal.get(i).getText();
    		if (DDValue.equalsIgnoreCase(Val)) {
    		 Status = true;
    		 
    		break;
				
			} else {
				
				Status = false;

			}
    	}
    		
    		if (Status == true){
    			
    			System.out.println("Value is in the DRop down menu");
				
			} else {
				
				System.out.println("Value is missing from the  DRop down menu");

			}
    		
			
		}
     
     public void Handlalerts(WebDriver driver) {
    	 
    	 Alert alert = driver.switchTo().alert();
    	 
    	 String Alerttext = alert.getText();
    	 
    	 System.out.println("Alerts text is  "+ Alerttext);
    	 
    	 alert.accept();
    	 
     }
     
     public void handlingframes(WebDriver driver, int Indexno) {
    	 
    	if (Indexno == 0) {
    		
    		System.out.println("**** Switch to first frame***");
    		driver.switchTo().frame(Indexno); 
			
		}else if (Indexno == 1) {
    		
    		System.out.println("**** Switch to second frame***");
    		driver.switchTo().frame(Indexno); 
			
		} 
    	 
    	 
     }
     
     
     public void switchoutfromframe(WebDriver driver) {
    	 
    	 driver.switchTo().defaultContent();// to come out of all the frames.
    	 	 
    	 
     }
     
     public void Waittime(WebDriver driver, By locator) {
    	 
    	 WebDriverWait wait = new WebDriverWait(driver, 10);
 		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    	 
     }
}
    	 
     
	

	
	



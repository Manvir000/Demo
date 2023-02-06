package Salenium_Concepts;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseTest;
 

public class TC007_Dropdownmenu {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//String exp = "Oct";
		//boolean status = true;
		
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
		// open the application
		TC005_Creatingmethods ct = new TC005_Creatingmethods();
		
		driver.get("http://facebook.com");
        //1. Click on the link
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		//WebElement monthdd =driver.findElement(By.name("birthday_month"));
		
		
		/*ct.selectvalurfromddmenu(driver.findElement(By.name("birthday_month")),9,"Month");
				
			Thread.sleep(2000);	
			
			ct.selectvalurfromddmenu(driver.findElement(By.name("birthday_month")),"Jul","Month");*/
		
		ct.checkvalindd(driver.findElement(By.name("birthday_month")), "Oct", "Month");
		
		
		/* Selecting the drop down menu value using select class
		Select select = new Select(monthdd);
		//1. Select by visible text
		//select.selectByVisibleText("Oct");
		//2. Select by Value
		//select.selectByValue("8");
		//3. Select By index
		 //select.selectByIndex(5);
		
		//4. count the number of the dropdown values
		List<WebElement> m = select.getOptions();
		int noofval = m.size();
		
		System.out.println("Number of drop down values are: " + noofval);
		
		
		//5. Get names of all the drop down menu options
		 for (int i = 0; i <noofval; i++) {
			 
			String ddval = m.get(i).getText();
			
			System.out.println("Values in the drop down menu are " + ddval);
			
			if (ddval.equalsIgnoreCase(exp)) {
				status = true;
				break;
				
				
			} else {
				
			status= false;

			}
			
		}
		 
		 if (status == true) {
			 
			 System.out.println("Value is present in the drop down menu");
			
		} else {
			
			System.out.println("Value is  not present in the drop down menu");

		}
			
		
	*/

}
}

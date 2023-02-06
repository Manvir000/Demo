package Salenium_Concepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;


import BaseClass.BaseTest;
 

public class TC008_Handlingalerts {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
			
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
		driver.findElement(By.name("proceed")).click();
		
		TC005_Creatingmethods ct =new TC005_Creatingmethods();
		ct.Handlalerts(driver);
		
		// Alerts interface is used to handle the Alerts
		
		/*Alert alert = driver.switchTo().alert();// Switching to the alert interface
		
		String AlertVal = alert.getText();// Get the Text of the Alert
		
		System.out.println("The text of the alert is   "+ AlertVal);
		Thread.sleep(2000);
	//	alert.accept();// To click on the OK button, it automatically click the enter key of the keyboard.
		
		alert.dismiss();// enter ESC key in the keyboard*/
		
		
		
		
		
		
		

}
}

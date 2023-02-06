package Salenium_Concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseTest;

public class TC010_HandlingWindows {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
	     driver.get("http://facebook.com");
	     
	     // Clicking on Create new account
		
		driver.findElement(By.linkText("Create new account")).click();
		
		String beforeclick = driver.getTitle();
		System.out.println("Window Title before clicking is " + beforeclick);
		
		
		
		//Clicking on Cookiews policy link
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//Switch to the window
		
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String Firstwindowid = itr.next();
		
	String Secondwindowid = itr.next();
		
		
		driver.switchTo().window(Secondwindowid);// Switching to other window
		
		System.out.println(Firstwindowid);
		System.out.println(Secondwindowid);
		
		 String afterclick = driver.getTitle();
		 System.out.println("Window Title after clicking is " + afterclick);

	}

}

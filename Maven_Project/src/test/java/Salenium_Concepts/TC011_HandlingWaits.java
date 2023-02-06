package Salenium_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseTest;

public class TC011_HandlingWaits {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
	     driver.get("http://facebook.com");
	     
	     // Clicking on Create new account
	     
	     // //a[@role ='button']
	     driver.findElement(By.xpath("(//a[@role ='button'])[2]")).click();// using an Xpath locator
		
		//driver.findElement(By.linkText("Create new account")).click();
		
		String beforeclick = driver.getTitle();
		System.out.println("Window Title before clicking is " + beforeclick);
		
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);//implicit wait time
		
		TC005_Creatingmethods ct = new TC005_Creatingmethods();
		ct.Waittime(driver, (By.linkText("Privacy Policy")));
		
		
		driver.findElement(By.linkText("Privacy Policy")).click();
	}

}

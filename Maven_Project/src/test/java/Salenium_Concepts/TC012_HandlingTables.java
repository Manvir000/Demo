package Salenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseTest;

public class TC012_HandlingTables {
     
	public static WebDriver driver;
	
	public static void main(String[] args) {
		BaseTest bt = new BaseTest();
	driver = bt.launchbrowser("chrome");
	
	driver.get("https://www.flyswoop.com/");
	
   WebElement Font = driver.findElement(By.xpath("//input[@id ='one-way']"));
   String Fontoftext =Font.getCssValue("Font");// to retrive the font of the text.
   System.out.println(Fontoftext);
	
	
	
				

	}

}

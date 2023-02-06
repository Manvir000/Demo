package Salenium_Concepts;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseTest;
 

public class TC009_HandlingFrames {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
			
		BaseTest bt = new BaseTest();
		driver = bt.launchbrowser("Chrome");
		
		driver.get("https://jqueryui.com/droppable/");
		
		TC005_Creatingmethods ct = new TC005_Creatingmethods();
		ct.handlingframes(driver, 0);
		
		Actions action = new Actions(driver);
		//driver.switchTo().frame(0);// to access the frame element , we need to switch to frame
		
	/*String dragtext =driver.findElement(By.id("draggable")).getText();
       System.out.println("Draggable text is " +dragtext);*/
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
       Thread.sleep(5000);
		
       ct.switchoutfromframe(driver);
       	
      //driver.findElement(By.linkText("Resizable")).click();
       
       action.click(driver.findElement(By.linkText("Resizable")));
      
     
      
      // mOve to element, RightClick, double click
      
     
      action.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
      
      Thread.sleep(5000);
      
      //driver.findElement(By.linkText("Bug Triage")).click();
      
      action.click(driver.findElement(By.linkText("Bug Triage")));
      
      action.sendKeys(driver.findElement(By.name("s")), "manvir");
     

}
}

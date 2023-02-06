package TestNgConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_TestConcept {
	
	@Test  // @test is an annotation.
	public void gettitleofbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.ca");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of the browser is" + driver.getTitle());
		
		
	}

}

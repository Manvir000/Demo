package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver =null;
	
	/**
	 * @author manvir
	 * @param browsername 
	 * @date Dec 14, 2022
	 * @Description This method is created to launch the browser
	 */
	public WebDriver launchbrowser(String browsername){
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    System.out.println("Chrome is opened successfully");
			
		} else if (browsername.equalsIgnoreCase("firefox")) {
			
			  	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Firefox is opened successfully");
			
		} else if(browsername.equalsIgnoreCase("edge")){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge is opened successfully");
			}else {
				
				System.out.println("Please pass the correct browser name. Curently we are supporting Edge/chrome/Firefox");
			}

		driver.manage().window().maximize();
		
		
		return driver;
			
		
	}
	
	public WebDriver closebrowser() {
		driver.close();
		
		return driver;
		
		
	}

}

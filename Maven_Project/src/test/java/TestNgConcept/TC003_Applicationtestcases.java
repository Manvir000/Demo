package TestNgConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_Applicationtestcases {
	
	public WebDriver driver;
	
	//Launch application
	@BeforeMethod
	public void setup()throws IOException {
		
		Properties prop  = new Properties();
		FileInputStream fir = new FileInputStream("C:\Users\manvi\eclipse-workspace\Maven_Project\config.properties");
		prop.load(fir);
		String appurl = prop.getProperty("URL");
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome is launched sucesfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(appurl);
		System.out.println("Application is launched successfully");
		
	}
	//close application
	@AfterMethod
	public void Close() {
		
		driver.quit();
		System.out.println("Application is closed  successfully");
		
	}
	
	//1. get the title of the application.
	@Test(priority=1)
	public void Gettitle() {
		String apptitle = driver.getTitle();
		Assert.assertEquals(apptitle, "Login - thebay.com", "The bay login is not opened");		
		System.out.println("Correct application is opened");
			
	}
	
	//2. login the application.
	@Test(priority=2)
	public void login() {
		
		
		/*driver.findElement(By.id("login-form-email")).sendKeys("manvirdeol93@gmail.com");
		driver.findElement(By.id("login-form-password")).sendKeys("MK19930716@deol");
		driver.findElement(By.xpath("//button[contains(@class, 'account-btn')]")).click();*/
		
	By usertext = By.id("login-form-email");
	By Pswdtext = By.id("login-form-password");
	By lgnbtn =   By.xpath("//button[contains(@class, 'account-btn')]");
	By Dsgnrlnk = By.id("1526656690093");
	
	
	driver.findElement(usertext).clear();
	driver.findElement(usertext).sendKeys("manvirdeol93@gmail.com");
	
	driver.findElement(Pswdtext).clear();
	driver.findElement(Pswdtext).sendKeys("MK19930716@deol");
	
	driver.findElement(lgnbtn).click();
	
	
	 Assert.assertTrue(driver.findElement(Dsgnrlnk).isDisplayed(), "Login unsuccessful");
		
	System.out.println("Login Successfull");
		
	}
	
	//3. Check the test present in the title.
	@Test(priority=3)
	public void checkthetext() {
		String appurl = driver.getCurrentUrl();
		Assert.assertEquals(appurl, "https://www.thebay.com/account/login", "Correct app is not launched");
		
		
		System.out.println("Correct application is launched");
	}
	

}

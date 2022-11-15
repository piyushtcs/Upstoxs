package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sweety\\eclipse-workspace\\Upstoks_hybridFrmwrk\\Drivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login-v2.upstox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
/*	@AfterClass
	public void closeBrowser() {
		driver.quit();
	
		
	}*/
	
	
	
}

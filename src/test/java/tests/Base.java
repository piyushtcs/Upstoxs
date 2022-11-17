package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PageObjects.DOB_page;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.VerifyPage;
import Utilities.ReadConfig;


public class Base {
public WebDriver driver;
   
	@BeforeClass
	public void OpenBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sweety\\eclipse-workspace\\Upstocks\\Drivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login-v2.upstox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void actLogin() throws Throwable {
		LoginPage log=new LoginPage(driver);
		log.getUN();
		log.getPass();
		log.getLoginClick();
		
		DOB_page db=new DOB_page(driver);
		
		db.getCode();
		try {
		VerifyPage vp=new VerifyPage(driver);
		Thread.sleep(3000);
		vp.getVerify();
		}
		catch(Exception e) {
			
		}
	}
	@AfterMethod
	public void logOut() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.getLogOut();
		Thread.sleep(3000);
		driver.get("https://login-v2.upstox.com/");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	
		
	}
	
	

}

package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ReadConfig;



public class LoginPage  {
	
	public static String expErr="We have noticed that your password has not been reset recently. To proceed, please reset your password by clicking on \"Forgot Password\" option below.";
	@FindBy (xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy (xpath="//input[@id='password']") private WebElement pass;
	@FindBy (xpath="//div[text()='Sign into Upstox']") private WebElement loginBtn;
	@FindBy (xpath="@FindBy (xpath=\"//div[text()='Sign into Upstox']\") private WebElement loginBtn;") private WebElement actErr;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void getUN() throws Throwable {
		ReadConfig kk=new ReadConfig();
		UN.clear();
		UN.sendKeys(kk.getUsername());
		}
	public void getPass() throws Throwable {
		ReadConfig kk=new ReadConfig();
		pass.clear();
		pass.sendKeys(kk.getPassword());
	}
	public void getLoginClick() {
		loginBtn.click();
	}
	public String getActErr() {
		String err=actErr.getText();
		return err;
	}
	
	
	
}

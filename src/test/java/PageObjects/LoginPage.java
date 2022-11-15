package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	@FindBy (xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy (xpath="//input[@id='password']") private WebElement pass;
	@FindBy (xpath="//div[text()='Sign into Upstox']") private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void getUN() {
		UN.sendKeys("HH7153");
		}
	public void getPass() {
		pass.sendKeys("Muleradhe@11");
	}
	public void getLoginClick() {
		loginBtn.click();
	}
	
	
	
}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOB_page {
	@FindBy (xpath="//input[@id='yob']") private WebElement code;
	
	public DOB_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getCode() {
		code.sendKeys("1994");
	}
}

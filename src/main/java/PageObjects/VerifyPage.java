package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage {
	@FindBy (xpath="//div[text()='No, I’m good']") private WebElement verify;

	public VerifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void getVerify() {
		verify.click();
	}

}

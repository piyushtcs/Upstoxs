package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement myAct;
	@FindBy (xpath="//div[text()='Logout']") private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void getLogOut() {
		myAct.click();
		logout.click();
		
	}

}

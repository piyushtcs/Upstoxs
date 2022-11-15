package tests;

import org.testng.annotations.Test;

import PageObjects.DOB_page;
import PageObjects.LoginPage;
import PageObjects.VerifyPage;

public class TC2 extends Base{
	@Test
	public void login() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.getUN();
		lp.getPass();
		lp.getLoginClick();
		DOB_page db=new DOB_page(driver);
		db.getCode();
		VerifyPage vp=new VerifyPage(driver);
		vp.getVerify();
		
	}
	
	@Test 
	public void loin2() {
		System.out.println("Login test 2");
	}
	
	
	
	

}

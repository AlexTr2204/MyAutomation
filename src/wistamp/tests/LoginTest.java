package wistamp.tests;

import org.testng.annotations.Test;

import wistemp.pageObject.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(description = "Test login with wrong details")
	public void loginFailure() {
		LoginPage login1 = new LoginPage(driver);
		login1.login("shavitQA@gmail.com", "shavitDemo!111");
		String expected = "Wrong user or password try again or read this";
		String actual = login1.getErrorMessage();
		org.testng.Assert.assertEquals(actual, expected);
	}

	@Test(description = "Test login with correct details")
	public void loginSucess() {
		LoginPage login1 = new LoginPage(driver);
		login1.login("shavitQA@gmail.com", "shavitDemo!123");
		String expected = "Take your signature to the next level";
		String actual = login1.LoginValidation();
		org.testng.Assert.assertEquals(actual, expected);
	}

}

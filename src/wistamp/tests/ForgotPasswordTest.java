package wistamp.tests;


import org.testng.annotations.Test;

import wistemp.pageObject.ForgotPasswordPage;
import wistemp.pageObject.LoginPage;

public class ForgotPasswordTest extends BaseTest {

	@Test(description = "Test login with wrong details")
	public void forgotPass ()  {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.forgotPassword();
		ForgotPasswordPage forgotpassword = new ForgotPasswordPage(driver);
		forgotpassword.forgotPass("shavit@shavit.com");

		ForgotPasswordPage verificationSignature = new ForgotPasswordPage(driver);
		String expected = "Something went wrong, please try again";
		String actual = verificationSignature.getMessage();
		org.testng.Assert.assertEquals(actual, expected);

	}
}

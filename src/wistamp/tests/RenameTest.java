package wistamp.tests;

import org.testng.annotations.Test;

import wistemp.pageObject.LoginPage;
import wistemp.pageObject.MySignatruesPage;


public class RenameTest extends BaseTest {

	@Test(description = "Test rename signature")
	public void RenameSignature () throws InterruptedException {

		LoginPage login1 = new LoginPage(driver);
		login1.login("shavitQA@gmail.com", "shavitDemo!123");
		MySignatruesPage actions = new MySignatruesPage(driver);
		actions.clickActions();
		actions.actRename(0);
		actions.rename("My Signature");
		actions.clickRename();
		
		Thread.sleep(3000);
		
		actions.clickActions();
		actions.actRename(0);
		actions.rename("New Signature");
		actions.clickRename();

		Thread.sleep(3000);

		MySignatruesPage verificationSignature = new MySignatruesPage(driver);
		String expected = "New Signature1";
		String actual = verificationSignature.sigValidation();
		org.testng.Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Test pop up")
	public void greenPopUp () {

		MySignatruesPage verificationSignature = new MySignatruesPage(driver);
		String expected = "Signature has been renamed to New Signature!";
		String actual = verificationSignature.popUp();
		org.testng.Assert.assertEquals(actual, expected);
	}
}

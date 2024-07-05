package wistamp.tests;

import org.testng.annotations.Test;

import wistemp.pageObject.DetailsPage;
import wistemp.pageObject.LoginPage;
import wistemp.pageObject.MySignatruesPage;
import wistemp.pageObject.SignaturePreviewPage;

public class TestEdit extends BaseTest {

	@Test(description = "Test add details")
	public void addDetails () throws InterruptedException {

		LoginPage login1 = new LoginPage(driver);
		login1.login("shavitQA@gmail.com", "shavitDemo!123");
		MySignatruesPage edit = new MySignatruesPage(driver);
		edit.clickEdit();
		DetailsPage detailsP = new DetailsPage(driver);
		detailsP.details("Alex", "No1", "AlexFC", "0466778899", "05066778899", "alexFC.com", "alexFC@alex.com", "Israel");

		Thread.sleep(3000);

		SignaturePreviewPage verificationName = new SignaturePreviewPage(driver);
		String expected = "Alex";
		String actual = verificationName.name();
		org.testng.Assert.assertEquals(actual, expected);
	}
}

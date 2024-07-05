package wistamp.tests;

import org.testng.annotations.Test;

import wistemp.pageObject.AppsPage;
import wistemp.pageObject.DetailsPage;
import wistemp.pageObject.LoginPage;
import wistemp.pageObject.MySignatruesPage;
import wistemp.pageObject.SignaturePreviewPage;
import wistemp.pageObject.VideoPage;

public class AppDetailsTest extends BaseTest {

	@Test(description = "Test add video")
	public void addVideo () {

		LoginPage login1 = new LoginPage(driver);
		login1.login("shavitQA@gmail.com", "shavitDemo!123");
		MySignatruesPage edit = new MySignatruesPage(driver);
		edit.clickEdit();
		DetailsPage apps = new DetailsPage(driver);
		apps.clickApps();
		AppsPage video = new AppsPage(driver);
		video.clickVideo();
		VideoPage detailsP = new VideoPage(driver);
		detailsP.VideoAppActions("https://www.youtube.com/watch?v=KVKCmlDRN3c&list=RDKVKCmlDRN3c&start_radio=1", "Gal Adam");
		video.moveSlider();
		video.AddButtonClick();

		SignaturePreviewPage verificationTittle = new SignaturePreviewPage(driver);
		String expected = "Gal Adam";
		String actual = verificationTittle.title();
		org.testng.Assert.assertEquals(actual, expected);

	}
}


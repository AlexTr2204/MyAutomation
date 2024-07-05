package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends BasePage {

	//declaring on varaible
	@FindBy(css="[name=\"video_url\"]")
	WebElement insertUrl;
	@FindBy(css="[name=\"user_title\"]")
	WebElement insertTitle;
	@FindBy(css="[style=\"background-color: rgb(238, 190, 54);\"]")
	WebElement clickOrangeColor;

	//constractor
	public VideoPage(WebDriver driver) {
		super(driver);
	}

	public void VideoAppActions(String url, String title) {
		fillText(insertUrl, url);
		fillText(insertTitle, title);
		click(clickOrangeColor);

	}
}

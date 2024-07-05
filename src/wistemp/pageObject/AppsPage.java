package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppsPage extends BasePage {

	//declaring on varaible
	@FindBy(css="[aid=\"page.editor.apps.youtube_status\"]")
	WebElement clickVideo;
	@FindBy(css="[class=\"vue-slider-dot-handle\"]")
	WebElement slider;
	@FindBy(css=".app__bottom>div>button")
	WebElement addAppButton;



	//constractor
	public AppsPage(WebDriver driver) {
		super(driver);
	}

	public void clickVideo() {
		click(clickVideo);
	}

	public void moveSlider() {
		DragAndDrop(slider);
	}

	public void AddButtonClick() {
		click(addAppButton);
	}

}

package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignaturePreviewPage extends BasePage {

	@FindBy(css=".ws-tpl-name")
	WebElement nameText;
	@FindBy(css=".ws-tpl-company")
	WebElement company;
	@FindBy(css="[style=\"color: #EEBE36; font-size: 13px; font-family: Arial\"]")
	WebElement titleText;


	public SignaturePreviewPage(WebDriver driver) {
		super(driver);
	}

	public String name() {
		return nameText.getText();
	}

	public String company() {
		return company.getText();
	}

	public String title() {
		return titleText.getText();
	}

}


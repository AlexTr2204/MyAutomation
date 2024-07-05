package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage extends BasePage{

	//declaring on varaible
	@FindBy(css="[aid=\"signature_editor.input.name\"]")
	WebElement insertName;
	@FindBy(css="[aid=\"signature_editor.input.title\"]")
	WebElement insertTitle;
	@FindBy(css="[aid=\"signature_editor.input.company\"]")
	WebElement insertCompany;
	@FindBy(css="[aid=\"signature_editor.input.phone\"]")
	WebElement insertPhone;
	@FindBy(css="[aid=\"signature_editor.input.mobile\"]")
	WebElement insertMobile;
	@FindBy(css="[aid=\"signature_editor.input.website\"]")
	WebElement insertWebsite;
	@FindBy(css="[aid=\"signature_editor.input.email\"]")
	WebElement insertEmail;
	@FindBy(css="[aid=\"signature_editor.input.address\"]")
	WebElement insertAddress;
	@FindBy(css="[aid=\"page.editor.signature.tabs.addons\"]")
	WebElement moveApps;

	//constractor
	public DetailsPage(WebDriver driver) {
		super(driver);

	}

	public void details(String name, String title, String company, String phone, String mobile, String website, String email, String address) {
		fillText(insertName, name);
		fillText(insertTitle, title);
		fillText(insertCompany, company);
		fillText(insertPhone, phone);
		fillText(insertMobile, mobile);
		fillText(insertWebsite, website);
		fillText(insertEmail, email);
		fillText(insertAddress, address);
	}

	public void clickApps() {
		click(moveApps);
	}


}

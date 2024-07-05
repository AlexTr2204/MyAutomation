package wistemp.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MySignatruesPage extends BasePage {

	//declaring on varaible
	@FindBy(css=".signature-item-edit-btn")
	WebElement EditBtn;
	@FindBy(css="[class=\"signature-item-actions-btn\"]")
	WebElement ActionsBtn;
	@FindBy(css=".one-sig-rename-input")
	WebElement addText;
	@FindBy(css="[class=\"one-sig-rename-btn one-sig-rename-btn-rename\"]")
	WebElement renameBtn;
	@FindBy(css="[class=\"signature-item-header-details-title\"]")
	WebElement signatureValid;
	@FindBy(css=".signature-item-actions>div>div>div")
	List<WebElement> clickRenameBtn;
	@FindBy(css=".vue-notification-wrapper>div")
	WebElement validationPopUp;


	//constractor
	public MySignatruesPage(WebDriver driver) {
		super(driver);

	}

	public void clickEdit() {
		click(EditBtn);
	}
	public void clickActions() {
		click(ActionsBtn);
	}

	public void rename(String signature) {
		fillText(addText, signature);
	}

	public void clickRename() {
		click(renameBtn);
	}

	public String sigValidation() {
		return signatureValid.getText();
	}

	public void actRename(int Picker) {
		click(clickRenameBtn.get(Picker));
	}
	public String popUp() {
		return validationPopUp.getText();
	}

}

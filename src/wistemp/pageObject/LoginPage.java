package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	//declaring on variable
	@FindBy(css="[href=\"/forgot_password\"]")
	WebElement forgotPasswordLink;
	@FindBy(css="[aid=\"page.login.form.input.email\"]")
	WebElement Email;
	@FindBy(css="[aid=\"page.login.form.input.password\"]")
	WebElement Password;
	@FindBy(css="[aid=\"page.login.form.login.button\"]")
	WebElement submitBtn;
	@FindBy(css="[aid=\"page.login.message.error\"]")
	WebElement errorMsg;
	@FindBy(css=".upgrade-box-title")
	WebElement nextLevel;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//actions

	public void forgotPassword() {
		click(forgotPasswordLink);
	}

	public void login(String email, String password) {
		fillText(Email, email);
		fillText(Password, password);
		click(submitBtn);
	}

	public String getErrorMessage() {
		return errorMsg.getText();
	}

	public String LoginValidation() {
		return nextLevel.getText();
	}

}
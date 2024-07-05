package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	@FindBy(css="[aid=\"page.forgot-password.form.input.email\"]")
	WebElement email;
	@FindBy(css=".btn.forgot-password-form-confirm")
	WebElement submit;
	@FindBy(css=".forgot-password-error")
	WebElement errorMsg;

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	//actions
	public void forgotPass(String user) {
		fillText(email, user);
		click(submit);
	}

	public String getMessage() {
		return errorMsg.getText();
	}

}

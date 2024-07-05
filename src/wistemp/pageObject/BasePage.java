package wistemp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	WebDriver driver;


	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click(WebElement el) {
		el.click();
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}

	public void DragAndDrop(WebElement el) {
		Actions action = new Actions(driver);
		action.dragAndDropBy(el, 50, 0);
		action.perform();
	}

	public void hoverOnElement(WebElement el) {
		Actions action = new Actions(driver);
		action.dragAndDropBy(el, 50, 0);
		action.perform();
	}

}

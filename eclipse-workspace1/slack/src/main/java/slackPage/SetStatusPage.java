package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.SetStatusModel;

public class SetStatusPage extends SetStatusModel {

	public SetStatusPage(WebDriver d) {
		super(d);
		
	}
	public void clickActiveArrow() {
		WebElement caa = getActiveArrow();
		caa.click();
	}
	public void clickSetStatus() {
		WebElement css = getUpdateStatus();
		css.click();
	}
	public void inputStatus(String svalue) {
		WebElement is = getiInputStatus();
		is.sendKeys(svalue);
	}
	public void clickStatusSave() {
		WebElement css = getStatusSave();
		css.click();
	}

}

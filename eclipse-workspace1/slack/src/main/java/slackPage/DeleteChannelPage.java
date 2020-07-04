package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.DeleteChannelModel;

public class DeleteChannelPage extends DeleteChannelModel {

	public DeleteChannelPage(WebDriver d) {
		super(d);
		
	}
	public void clickYes() {
		WebElement cy = getYes();
		cy.click();
	}
	public void clickDeleteChanel() {
		WebElement dc = getDeleteChannel();
		dc.click();
	}

}

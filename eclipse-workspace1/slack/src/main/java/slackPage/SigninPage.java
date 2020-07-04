package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import slackModel.SigninModel;

public class SigninPage extends SigninModel {

	public SigninPage(WebDriver d) {
		super(d);
		
	}
	public void clickOnSigninToSlack() {
		WebElement sis = getSigninToSlack();
		
		sis.click();
	}
	

}

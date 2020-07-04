package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.HomeModel;

public class HomePage extends HomeModel {

	
	
	public HomePage(WebDriver d) {
		super(d);
		
	
	}
	public void clickOnGetStarted() {
		WebElement gs = getStarted();
		gs.click();
		
		
	}
	public void clickOnSigninToLogin() {
		WebElement sisl = getSignin();
		
		sisl.click();
	}	

}

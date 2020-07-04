package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninModel extends ModelBase {

	public SigninModel(WebDriver d) {
		super(d);
		
	}
	
	public WebElement getSigninToSlack() {
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement sts = driver.findElement(By.xpath("//*[contains(@data-qa,'link_sign_in_nav')]"));
		wait.until(ExpectedConditions.elementToBeClickable(sts));
		return sts;
		
		
	}
	
}

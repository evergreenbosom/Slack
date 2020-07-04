package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends ModelBase {

	public HomeModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getStarted() {
		WebElement gst =driver.findElement(By.xpath("//*[contains(@class,'c-button v--left v--primary')]"));
		return gst;
	}
	public WebElement getSignin() {
		WebElement sil = driver.findElement(By.xpath("//*[contains(@data-qa,'link_sign_in_nav')]"));
		return sil;
		
	}


}

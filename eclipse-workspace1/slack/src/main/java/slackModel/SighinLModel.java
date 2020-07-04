package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SighinLModel extends ModelBase {

	public SighinLModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getSignin() {
		WebElement sil = driver.findElement(By.xpath("//*[contains(@class,'c-nav--signed-out')]/a[1]"));
		return sil;
		
	}

}

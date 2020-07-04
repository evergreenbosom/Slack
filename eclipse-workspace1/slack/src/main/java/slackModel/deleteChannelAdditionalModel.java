package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteChannelAdditionalModel extends ModelBase{

	public deleteChannelAdditionalModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getDeleteThisChannel() {
		WebElement dtc = driver.findElement(By.xpath("//*[text()='Delete this channel']"));
		return dtc;
		
	}


}

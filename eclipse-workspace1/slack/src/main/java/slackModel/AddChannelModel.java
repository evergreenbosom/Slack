package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddChannelModel extends ModelBase {

	public AddChannelModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getAddChnnel() {
		WebElement adc = driver.findElement(By.xpath("//*[contains(@data-qa,'channel_sidebar_name_add_channel')]"));
		return adc;
		
	}
	

}

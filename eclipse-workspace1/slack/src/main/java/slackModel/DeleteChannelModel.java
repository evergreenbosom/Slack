package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteChannelModel extends ModelBase {

	public DeleteChannelModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getYes() {
		WebElement gy = driver.findElement(By.xpath("//*[contains(@id,'delete_channel_cb')]"));
		return gy;
		
}
	public WebElement getDeleteChannel() {
		WebElement dc = driver.findElement(By.xpath("//*[contains(@data-qa,'create_action')]"));
		return dc;
		
	}

}

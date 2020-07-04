package slack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.deleteChannelAdditionalModel;

public class deleteChannelAdditionalPage extends deleteChannelAdditionalModel{

	public deleteChannelAdditionalPage(WebDriver d) {
		super(d);
		
	}
	public void clickDeleteThisChannel() {
		WebElement dtc = getDeleteThisChannel();
		dtc.click();
		
	}

}

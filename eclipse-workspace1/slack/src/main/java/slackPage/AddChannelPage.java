package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.AddChannelModel;

public class AddChannelPage extends AddChannelModel {

	public AddChannelPage(WebDriver d) {
		super(d);
		
	}
	public void clickAddChannel() {
		WebElement cac = getAddChnnel();
		cac.click();
		
	}

}

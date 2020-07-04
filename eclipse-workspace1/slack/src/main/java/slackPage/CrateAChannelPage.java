package slackPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.CreateAChannelModel;

public class CrateAChannelPage extends CreateAChannelModel {

	public CrateAChannelPage(WebDriver d) {
		super(d);

	}

	public void clickAddChannel() {
		WebElement cac = getAddChannel();
		cac.click();
	}

	public void clickCreateAChannel() {
		WebElement ccac = getCreateAChannel();
		ccac.click();
	}

	public void inputCreateAChannelName(String nvalue) {
		WebElement ican = getCreatAChannelName();
		ican.sendKeys(nvalue);
	}

	public void inputCreateAChannelDes(String dvalue) {
		WebElement icad = getCreatAChannelDes();
		icad.sendKeys(dvalue);
	}

	public void clickCreateAChannelCBtn() {
		WebElement ccacb = getCreatAChannelCBtn();
		ccacb.click();
	}

	public void clickCloseAddPeople() throws InterruptedException {
		
		WebElement cap = getCloseAddPeople();
		cap.click();
	}

	public boolean checkSlackTest() {
		WebElement cst = getSlackTest();
		return cst.isDisplayed();
	}

	public List<String> getAllChannels() {
		List<String> allChannels = new ArrayList<String>();
		List<WebElement> gcn = getChannels();
			for (WebElement e : gcn) {
			allChannels.add(e.getText());
		}
		return allChannels;

	}
	//Checking the expected channel is pressent on the list
	public boolean isChannelPresent(String chname) {
		boolean result;
		List<String> allChannels = getAllChannels();
		result = allChannels.contains(chname);
		
		return result;
		
	}

}

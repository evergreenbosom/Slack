package slackPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import slackModel.LeaveChannelModel;

public class LeaveChannelPage extends LeaveChannelModel {
	

	public LeaveChannelPage(WebDriver d) {
		super(d);
		
	
	}public void clickChannel() {
		WebElement cc = GetChannel();
		cc.click();
	}
	public void ClicSlackTest(String dvalue) throws InterruptedException {
		Actions ac = new Actions(driver) ;
		List<WebElement> all = getChannels();
		for(WebElement e: all) {
			if(e.getText().equals(dvalue)) {
				ac.contextClick(e).perform();
		}
		}
		
	}
	
	
	public void clickgetMoreOption() {
		WebElement lc = getMoreOption();
		lc.click();
	}
	
	
	
	public List<String> getAllChannels() throws InterruptedException {
		List<String> allChannels = new ArrayList<String>();
		List<WebElement> gcn = getChannels();
		for (WebElement e : gcn) {
			allChannels.add(e.getText());
		}
		return allChannels;
	}
	//checking the expected channel is present on the list or not.
	public boolean isChannelPresent(String chname) throws InterruptedException {
		boolean result;
		List<String> allChannels = getAllChannels();
		result = allChannels.contains(chname);
		return result;
	}
}

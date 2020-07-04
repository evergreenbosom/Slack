package slackModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LeaveChannelModel extends ModelBase {

	public LeaveChannelModel(WebDriver d) {
		super(d);
		
		
	}
	public WebElement GetChannel() {
		WebElement gc = driver.findElement(By.xpath("//*[contains(@data-qa,'channel_sidebar__section_heading_label__channels')]"));
		return gc;
		
	}
	public WebElement getSlackTest() {
		WebElement st = driver.findElement(By.xpath("//i[@type='channel-pane-hash']/following-sibling::span"));

		return st;
		
		
	}
	
	
	public WebElement getMoreOption() {
		WebElement lc = driver.findElement(By.xpath("//*[text()='Additional options…']"));
		return lc;
		
	}
		
	public List<WebElement> getChannels() throws InterruptedException {
		Thread.sleep(4000);
		List<WebElement> links = driver.findElements(By.xpath("//i[@type='channel-pane-hash']/following-sibling::span"));
		return links;
		
		
	}

}

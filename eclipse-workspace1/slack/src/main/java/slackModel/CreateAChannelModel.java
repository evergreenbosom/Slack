 package slackModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAChannelModel extends ModelBase {

	public CreateAChannelModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getAddChannel() {
		WebElement ac = driver.findElement(By.xpath("//*[contains(@data-qa,'channel_sidebar__plus__channels')]"));
		return ac;
		
	}
	public WebElement getCreateAChannel() {
		WebElement cac = driver.findElement(By.xpath("//*[contains(@data-qa,'menu_item_button-wrapper')][2]"));
		return cac;
		
	}
	public WebElement getCreatAChannelName() {
		WebElement cacn=driver.findElement(By.xpath("//*[contains(@aria-label,'Channel Name')]"));
		return cacn;
		
	}
	public WebElement getCreatAChannelDes() {
		WebElement cacd=driver.findElement(By.xpath("//*[contains(@aria-label,'Channel purpose')]"));
		return cacd;
		
	}
	public WebElement getCreatAChannelCBtn() {
		WebElement cacb=driver.findElement(By.xpath("//*[contains(@aria-label,'Create a channel')]"));
		return cacb;
		
	}
	public WebElement getCloseAddPeople() throws InterruptedException {
		Thread.sleep(4000);
		WebElement cap = driver.findElement(By.xpath("//*[contains(@data-qa,'invite_to_workspace_skip_button')]"));
		return cap;
		
	}
	public WebElement getSlackTest() {
		WebElement gst = driver.findElement(By.xpath("//*[contains(@data-qa,'channel_sidebar_name_slacktest')]"));
		return gst;
		
	}
	public List<WebElement> getChannels() {
		List<WebElement> links = driver.findElements(By.xpath("//i[@type='channel-pane-hash']/following-sibling::span"));
		return links;
		
		
	}
	

	
	
	

}

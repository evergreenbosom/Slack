package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostMessageModel extends ModelBase{

	public PostMessageModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getInputMessage() {
		WebElement im = driver.findElement(By.xpath("//*[contains(@id,'undefined')]"));
		return im;
		
	}
	public WebElement getSendMessage() {
		WebElement gsm = driver.findElement(By.xpath("//*[contains(@class,'c-icon c-icon--paperplane-filled')]"));
		return gsm;
		
	}
	public WebElement getMessagePostTime() {
		WebElement mpt = driver.findElement(By.xpath("//*[text()='3:49 PM']"));
		return mpt;
		
	}
	
	public WebElement getTimeElem(String string) {
		
		
		
		String xpath = "//*[text()='"+string+"']/ancestor::div[@class='c-message_kit__gutter__right']/preceding-sibling::div//a/span";
		
		
		
		WebElement time = driver.findElement(By.xpath(xpath));
		return time;
	}
	public WebElement getMessegeText(String mstring) {
		WebElement gmt = driver.findElement(By.xpath("//*[text()='"+mstring+"']"));
		return gmt;
		//*[text()='Hello Guys How']/ancestor::div[contains(@class,'c-message_kit__gutter__right')]/span
	}
	public WebElement getSender(String string) {
		WebElement gs = driver.findElement(By.xpath(string));
		return gs;
		
		
	}

} 

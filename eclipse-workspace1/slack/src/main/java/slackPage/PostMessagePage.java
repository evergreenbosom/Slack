package slackPage;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import slackModel.PostMessageModel;

public class PostMessagePage extends PostMessageModel{

	public PostMessagePage(WebDriver d) {
		super(d);
		
	}
	public void inputMessage(String mvalue) {
		WebElement im = getInputMessage();
		
		im.sendKeys(mvalue);
		
	}
	public void clickSendMessage() {
		WebElement csm = getSendMessage();
		csm.click();
	}
	public String messagePostedTime() {
		WebElement mpt = getMessagePostTime();
		String mptt = mpt.getText();
		return mptt;
	}
	public String getTime(String string) {
		
		Actions act = new Actions(driver);
		act.moveToElement(getTimeElem(string));
		act.perform();
		String time = getTimeElem(string).getText();

		
		
		return time;
	}
	public String getMessageText(String mstring) {
		String mest = getMessegeText(mstring).getText();
		return mest;
		
		
	}


}

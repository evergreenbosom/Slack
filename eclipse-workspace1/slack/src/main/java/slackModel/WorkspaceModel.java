package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkspaceModel extends ModelBase{

	public WorkspaceModel(WebDriver d) {
		super(d);
		
	}
	public WebElement inputWorkspaceUrl() {
		WebElement iwsu = driver.findElement(By.xpath("//input[contains(@id,'domain')]"));
		return iwsu;
		
	}
	
	public WebElement getWorkspaceContBtn() {
		WebElement wscnbtn = driver.findElement(By.xpath("//*[contains(@id,'submit_team_domain')]"));
		return wscnbtn;
		
	}

}
//show me add new channel and delete this channel automatically. 
//did you verify after add the channel 
//did you verify after delete the channel.
// i did after adding channel not after deleting
// first i am running delete channel then i will run create a channel
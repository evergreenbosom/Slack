package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.WorkspaceModel;

public class WorkspaceUrlPage extends WorkspaceModel {

	public WorkspaceUrlPage(WebDriver d) {
		super(d);
		
	}
	public void inputWorkspaceUrl(String wvalue) {
		
		WebElement iwsu = inputWorkspaceUrl();
		iwsu.sendKeys(wvalue);
		
	}
	
	public void clickWorkspaceContBtn() {
		WebElement wscb = getWorkspaceContBtn();
		wscb.click();
		
		
	}
	

}

package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.ActiveModel;

public class ActivePage extends ActiveModel {

	public ActivePage(WebDriver d) {
		super(d);
		
	}
	public void clickActiveArrow() {
		WebElement caa = getActiveArrow();
		caa.click();
	}
	public void clickSetAway() {
		WebElement csa = getSetAway();
		csa.click();
	}
	public String getActiveAwayText() {
		WebElement gaa = getActiveAway();
		String gaat= gaa.getText();
		System.out.println("to see the :: "+gaat);
		System.out.println(gaat.length());
		
		return gaat;
	
	}
	
	
	
	public void clickSetActive() {
		WebElement csa = getSetActive();
		
	
		csa.click();
	}

}

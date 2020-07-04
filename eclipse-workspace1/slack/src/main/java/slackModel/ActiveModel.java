package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Hello
public class ActiveModel extends ModelBase{

	public ActiveModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getActiveArrow() {
		WebElement gaa = driver.findElement(By.xpath("//*[contains(@class,'p-ia__sidebar_header__team_name_text')]"));
		return gaa;
	
	}
	public WebElement getSetAway() {
		WebElement gsa = driver.findElement(By.xpath("//*[contains(@class,'c-link--button p-ia__main_menu__user__presence_button')]"));
		return gsa;
		}
	public WebElement getActiveAway() {
		//WebDriverWait wait = new WebDriverWait(driver,30);
				
		WebElement gaa = driver.findElement(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence_label')]"));
		
		//wait.until(ExpectedConditions.textToBePresentInElementValue(gaa, "You’re set to away."));
		return gaa;
		
	}
	
	public WebElement getSetActive() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement gsa = driver.findElement(By.xpath("//*[contains(@aria-label,'[AWAY] Set yourself active')]"));
		//wait.until(ExpectedConditions.textToBePresentInElementValue(gsa, "You’re set to away."));
		return gsa;
		
	}

}

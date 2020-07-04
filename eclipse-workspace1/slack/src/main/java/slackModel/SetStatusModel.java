package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetStatusModel extends ModelBase {

	public SetStatusModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getActiveArrow() {
		WebElement gaa = driver.findElement(By.xpath("//*[contains(@class,'p-ia__sidebar_header__team_name_text')]"));
		return gaa;
	
	}
	public WebElement getUpdateStatus() {
		WebElement gus = driver.findElement(By.xpath("//*[contains(@data-qa,'main-menu-custom-status-item')]"));
		return gus;
		
	}
	public WebElement getiInputStatus() {
		WebElement gis = driver.findElement(By.xpath("//*[contains(@class,'p-custom_status_input__input_wrap')]//div/div/div[1]"));
		return gis;
		
	}
	public WebElement getStatusSave() {
		WebElement gss = driver.findElement(By.xpath("//*[contains(@data-qa,'custom_status_input_go')]"));
		return gss;
		 
	}

	

}

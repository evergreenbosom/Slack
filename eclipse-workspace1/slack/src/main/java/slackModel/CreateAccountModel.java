package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountModel extends ModelBase {

	public CreateAccountModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getCAUserName() {
		WebElement cun = driver.findElement(By.xpath("//*[contains(@name,'username')]"));
		return cun;
		
	}
	public WebElement getCAEmail() {
		WebElement cem = driver.findElement(By.xpath("//*[contains(@name,'email')]"));
		return cem;
	}
	public WebElement getPassword() {
		WebElement cpw = driver.findElement(By.xpath("//*[contains(@name,'password')]"));
		return cpw;
		
	}
	
	public WebElement getCheckBox() {
		WebElement cb = driver.findElement(By.xpath("//*[contains(@class,'c-input_checkbox')]"));
		return cb;
		
	}
	public WebElement getCreatAccount() {
		WebElement ca = driver.findElement(By.xpath("//*[contains(@id,'submit_btn')]"));
		return ca;
		
	}

}

package slackModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Model Test
//Author - Imran
public class AccLoginModel extends ModelBase {

	public AccLoginModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getAccSigninEmail() {
		WebElement ale = driver.findElement(By.xpath("//*[contains(@id,'email')]"));
		return ale;
		
	}
	public WebElement getAccSigninPassword() {
		WebElement alp = driver.findElement(By.xpath("//*[contains(@id,'password')]"));
		return alp;

}
	public WebElement getAccSigninSiBtn() {
		WebElement alsb = driver.findElement(By.xpath("//*[contains(@id,'signin_btn')]"));
		return alsb;

}
	
	
	public WebElement getWorkspaceName() {
		WebElement gwsn = driver.findElement(By.xpath("//*[contains(@class,'p-ia__sidebar_header__team_name_text')]"));
		return gwsn;

}
}
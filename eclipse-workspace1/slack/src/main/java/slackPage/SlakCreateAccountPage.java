package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.CreateAccountModel;

public class SlakCreateAccountPage extends CreateAccountModel{

	public SlakCreateAccountPage(WebDriver d) {
		super(d);
		
	}
	public void inputCreateAccountUser(String uvalue) {
		WebElement cau = getCAUserName();
		cau.sendKeys(uvalue);
	}
	public void inputCreateAccountEmail(String evalue) {
		WebElement cae = getCAEmail();
		cae.sendKeys(evalue);
	}
	public void inputCreateAccountPassword(String pvalue) {
		WebElement cap = getPassword();
		cap.sendKeys(pvalue);
		
	}
	public void clickCreateAccountCheckbox() {
		WebElement ccb = getCheckBox();
		ccb.click();
		
	}
	public void clickCreateAccountBtn() {
		WebElement cab = getCreatAccount();
		cab.click();
	}

}

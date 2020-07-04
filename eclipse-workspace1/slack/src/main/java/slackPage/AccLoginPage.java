package slackPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import slackModel.AccLoginModel;

public class AccLoginPage extends AccLoginModel {

	public AccLoginPage(WebDriver d) {
		super(d);
		
	}
	public void inputAccSigninEmail(String evalue) {
		WebElement ase = getAccSigninEmail();
		ase.sendKeys(evalue);
		
	}
	
	public void inputAccSigninPassword(String pvalue) {
		WebElement asp = getAccSigninPassword();
		asp.sendKeys(pvalue);
		
	}
	public void clickAccSigninBtn() {
		WebElement asb = getAccSigninSiBtn();
		asb.click();	
	}
	public String getWorkspaceNameText() {
		WebElement cwsn = getWorkspaceName();
		String wst = cwsn.getText();
		System.out.println(wst);
		return wst;
	}
	

}

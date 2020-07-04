package slack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.DataFeeder;

public class ActiveTest extends TestBase {
	@Test (priority=1 ,dataProvider="signupinfo")
	public void logintest(String wsurl,String email, String password ) throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		Thread.sleep(3000);
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl(wsurl);
		Thread.sleep(3000);
		slackworkspaceurlpage.clickWorkspaceContBtn();
	
		getSlackAccSigninPage();
		slackaccsigninpage.inputAccSigninEmail(email);
		slackaccsigninpage.inputAccSigninPassword(password);
		slackaccsigninpage.clickAccSigninBtn();
		String actext = slackaccsigninpage.getWorkspaceNameText();
		Assert.assertEquals(actext, "imran & iham");

}
	
	@Test (priority = 2)
	public void setAwayTest() throws InterruptedException {
		getSlackActivePage();
		slackactivepage.clickActiveArrow();
		Thread.sleep(3000);
		String gatactual = slackactivepage.getActiveAwayText();
		Thread.sleep(2000);
		//System.out.println(gatactual);
		String expectedAw ="You’re set to away.";
		
		if (gatactual.equals(expectedAw)) {
			slackactivepage.clickSetAway();
			Thread.sleep(3000);
		}
			slackactivepage.clickSetAway();

				
		String gatactualac = slackactivepage.getActiveAwayText();
		String expectedac = "You’re set to away.";
		System.out.println(gatactualac);
		Assert.assertEquals(gatactualac, expectedac);
		

		}
	@Test (priority = 3)
	public void setActiveTest() throws InterruptedException {
		//getSlackActivePage();
		//slackactivepage.clickActiveArrow();
		Thread.sleep(3000);
		String gatactual = slackactivepage.getActiveAwayText();
		Thread.sleep(2000);
		//System.out.println(gatactual);
		String expectedAw ="You’re set to active.";
		
				if (gatactual.equals(expectedAw)) {
			slackactivepage.clickSetAway();
			Thread.sleep(3000);
		}
			slackactivepage.clickSetAway();

				
		String gatactualac = slackactivepage.getActiveAwayText();
		String expectedac = "You’re set to active.";
		System.out.println(gatactualac);
		Assert.assertEquals(gatactualac, expectedac);
		

		}
		@DataProvider(name="signupinfo")
	public Object [][] datafeeder() throws IOException{
		
		String filePath = "data/SlackData.xlsx";
		String sheetname = "signin";
		Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
		
		return t;
	}
	

}

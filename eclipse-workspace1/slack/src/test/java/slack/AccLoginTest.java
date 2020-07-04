package slack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import lib.DataFeeder;


public class AccLoginTest extends TestBase{
	
	@Test (dataProvider="signupinfo")
	public void workspaceUrltest(String wsurl,String email, String password ) throws InterruptedException {
		Thread.sleep(3000);
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl(wsurl);
		slackworkspaceurlpage.clickWorkspaceContBtn();
		
		getSlackAccSigninPage();
		slackaccsigninpage.inputAccSigninEmail(email);
		slackaccsigninpage.inputAccSigninPassword(password);
		slackaccsigninpage.clickAccSigninBtn();
		String actext = slackaccsigninpage.getWorkspaceNameText();
		Assert.assertEquals(actext, "imran & iham");
		
	
		
	}
	@DataProvider(name="signupinfo")
	public Object [][] datafeeder() throws IOException{
		
		String filePath = "data/SlackData.xlsx";
		String sheetname = "signin";
		Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
		
		return t;
		
	}

}

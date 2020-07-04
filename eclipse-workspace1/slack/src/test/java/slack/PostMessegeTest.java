package slack;

import java.io.IOException;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.DataFeeder;

public class PostMessegeTest  extends TestBase{
	String tmessage = "Hello Everyone";
	
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
	@Test(priority = 2)
	public void postMessageTest() throws InterruptedException {
		getSlackPostMessagePage();
		slackpostmessgegepage.inputMessage(tmessage);//Need Help Using TimeStamp
		slackpostmessgegepage.clickSendMessage(); 

			
		}
	
	@Test(priority=3)
	public void timeTestMessage() {
		Date date = new Date();
		
		
		String time =slackpostmessgegepage.getTime(tmessage);
		System.out.println(time);
		Assert.assertEquals(date, time);
		
	}
	@Test(priority =4 )
	public void postedMessageTest() {
		String mest = slackpostmessgegepage.getMessageText(tmessage);
		System.out.println(mest);
		Assert.assertEquals(mest, tmessage);
	}
	
	

		@DataProvider(name="signupinfo")
		public Object [][] datafeeder() throws IOException{
			
			String filePath = "data/SlackData.xlsx";
			String sheetname = "signin";
			Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
			
			return t;
		}
}
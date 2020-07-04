package slack;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.DataFeeder;


public class CreateAChannelTest  extends TestBase{
	@Test (priority=1 ,dataProvider="signupinfo")
	public void logintest(String wsurl,String email, String password ) throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		//Thread.sleep(3000);
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl(wsurl);
		//Thread.sleep(3000);
		slackworkspaceurlpage.clickWorkspaceContBtn();
	
		getSlackAccSigninPage();
		slackaccsigninpage.inputAccSigninEmail(email);
		slackaccsigninpage.inputAccSigninPassword(password);
		slackaccsigninpage.clickAccSigninBtn();
		String actext = slackaccsigninpage.getWorkspaceNameText();
		Assert.assertEquals(actext, "imran & iham");
		
	}
	@Test (priority=2,dataProvider="addchannelinfo")
	public void workspaceUrltest(String chname, String chdes) throws InterruptedException {
		//Delete Channel
		getSlackLeaveChannelPage();
		
		if(slackleavechannelpage.isChannelPresent(chname))
		{
		
		slackleavechannelpage.ClicSlackTest(chname);
		slackleavechannelpage.clickgetMoreOption();
		
		getdeleteChannelAdditionalPage();
		deletechanneladditionalpage.clickDeleteThisChannel();
		
		
		getDeleteChannelPage();
		deletechannelpage.clickYes();
		deletechannelpage.clickDeleteChanel();
	}
		
		//Create Channel
		getSlackCrateAChannelPage();
		slackcreateachannelpage.clickAddChannel();
		slackcreateachannelpage.clickCreateAChannel();
		slackcreateachannelpage.inputCreateAChannelName(chname);
		slackcreateachannelpage.inputCreateAChannelDes(chdes);
		slackcreateachannelpage.clickCreateAChannelCBtn();
		slackcreateachannelpage.clickCloseAddPeople();
				
		List<String> allChannels = slackcreateachannelpage.getAllChannels();
		System.out.println(allChannels);
		System.out.println(chname);
		Assert.assertTrue(allChannels.contains(chname));
		
		
	}

@DataProvider(name="signupinfo")
public Object [][] datafeeder() throws IOException{
	
	String filePath = "data/SlackData.xlsx";
	String sheetname = "signin";
	Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
	
	return t;
}
	@DataProvider(name="addchannelinfo")
	public Object [][] datafeedero() throws IOException{
		
		String filePath = "data/SlackData.xlsx";
		String sheetname = "addchannel";
		Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
		
		return t;
	}
}

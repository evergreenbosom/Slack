package slack;

import org.testng.annotations.Test;

public class AddChannelTest extends TestBase {
	
	@Test (priority = 1)
	public void workspaceUrltest() throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl("imraniham");
		slackworkspaceurlpage.clickWorkspaceContBtn();
		
	}
	@Test (priority = 2)
	public void accountSigninTest() throws InterruptedException {
		getSlackAccSigninPage();
		slackaccsigninpage.inputAccSigninEmail("abrariham19@gmail.com");
		slackaccsigninpage.inputAccSigninPassword("slacktest");
		slackaccsigninpage.clickAccSigninBtn();
		
	}
//	where is ur Asserttiion...... after channel additon
	//where is your assertion after deletion.. // show me th deletion one.
	@Test(priority=3)
	public void addChannelTest() {
		getSlackAddChannelPage();
		slackaddchannelpage.clickAddChannel();
	}

}

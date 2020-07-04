package slack;

import org.testng.annotations.Test;

public class SetStatusTest extends TestBase{
	
	@Test (priority = 1)
	public void workspaceUrltest() throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl("imraniham");
		slackworkspaceurlpage.clickWorkspaceContBtn();
	}
	@Test (priority = 2)
	public void accountSigninTest() {
		getSlackAccSigninPage();
		slackaccsigninpage.inputAccSigninEmail("abrariham19@gmail.com");
		slackaccsigninpage.inputAccSigninPassword("slacktest");
		slackaccsigninpage.clickAccSigninBtn();

}
	@Test(priority = 3)
	public void setStatusTest() {
		getSlackSetStatusPage();
		
		slacksetstatuspage.clickActiveArrow();
		slacksetstatuspage.clickSetStatus();
		slacksetstatuspage.inputStatus("Testing");
		slacksetstatuspage.clickStatusSave();
		
		
	}

}

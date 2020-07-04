package slack;

import org.testng.annotations.Test;

public class WorkspaceUrlTest extends TestBase {
	
	@Test
	public void workspaceUrltest() throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		getSlackWorkspaceUrlPage();
		slackworkspaceurlpage.inputWorkspaceUrl("imraniham");
		slackworkspaceurlpage.clickWorkspaceContBtn();
	}

}

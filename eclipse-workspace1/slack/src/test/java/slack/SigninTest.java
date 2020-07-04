package slack;

import org.testng.annotations.Test;

public class SigninTest extends TestBase {
	
	@Test
	public void signinToSlackTest() throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnGetStarted();
		getSlackSigninPage();
		slacksigninpage.clickOnSigninToSlack();
	}

}

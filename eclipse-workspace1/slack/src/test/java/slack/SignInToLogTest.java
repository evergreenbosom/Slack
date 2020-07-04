package slack;

import org.testng.annotations.Test;

public class SignInToLogTest extends TestBase{
	
	@Test
	public void signinToSlackTest() throws InterruptedException {
		getSlackSigninPage();
		slacksigninpage.clickOnSigninToSlack();
		getSlackHomePage();
		slackhomepage.clickOnSigninToLogin();
		

}
}

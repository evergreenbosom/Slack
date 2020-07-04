package slack;

import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
	
	@Test
	public void getStartedTest() {
		getSlackHomePage();
		slackhomepage.clickOnGetStarted();
	}

}

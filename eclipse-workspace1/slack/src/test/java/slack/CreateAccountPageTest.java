package slack;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.DataFeeder;

public class CreateAccountPageTest extends TestBase {
	//login by using user,password and email.
	@Test(priority=1)
	public void createAccountTestP() throws InterruptedException {
		getSlackHomePage();
		slackhomepage.clickOnGetStarted();
		getSlackSigninPage();
		slacksigninpage.clickOnSigninToSlack();
	}
		@Test(dataProvider="createaccinfo",priority=2)
		public void createAccountTest(String username, String email, String password) throws InterruptedException {
			
			getSlackCreateAccountPage();
			slackcreateaccountpage.inputCreateAccountUser(username);
			slackcreateaccountpage.inputCreateAccountEmail(email);
			slackcreateaccountpage.inputCreateAccountPassword(password);
			slackcreateaccountpage.clickCreateAccountCheckbox();
			slackcreateaccountpage.clickCreateAccountBtn();
	}
		@DataProvider(name="createaccinfo")
		public Object [][] datafeeder() throws IOException{
			
			String filePath = "data/SlackData.xlsx";
			String sheetname = "createinfo";
			Object [][] t = DataFeeder.excelToObject(filePath, sheetname);
			
			return t;
			
		}

}

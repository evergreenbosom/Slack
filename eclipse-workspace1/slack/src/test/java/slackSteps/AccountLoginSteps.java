package slackSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import slack.TestBase;
import slackPage.AccLoginPage;
import slackPage.HomePage;
import slackPage.WorkspaceUrlPage;


public class AccountLoginSteps  {
	WebDriver driver;
	TestBase testb; 
	HomePage home;
	WorkspaceUrlPage url;
	AccLoginPage login;
	
	@Before
	
	//@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://slack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	
}
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		
		
//		testb = new TestBase();
//		 testb.setUp();
	 
	}

	@When("^I invoke Slack signin Method$")
	public void i_invoke_Slack_signin_Method() throws Throwable {
		home = new HomePage(driver);
		home.clickOnSigninToLogin();
		
	}
	@When("^I invoke Slack Workspace Method \"(.*?)\"$")
	public void i_invoke_Slack_Workspace_Method(String ws) throws Throwable {
		url = new WorkspaceUrlPage(driver);	
		url.inputWorkspaceUrl(ws);
		url.clickWorkspaceContBtn();
		
	    
	}

	@When("^I invoke User Method \"(.*?)\"$")
	public void i_invoke_User_Method(String username) throws Throwable {
		login = new AccLoginPage(driver);
		login.inputAccSigninEmail(username);
		
	    
	}

	@When("^I invoke Password Method \"(.*?)\"$")
	public void i_invoke_Password_Method(String password) throws Throwable {
		login = new AccLoginPage(driver);
		login.inputAccSigninPassword(password);
	   
	}

	@When("^I invoke Click Login Method$")
	public void i_invoke_Click_Login_Method() throws Throwable {
		login = new AccLoginPage(driver);
		login.clickAccSigninBtn();
	   
	}

	@Then("^I validate Workspace \"(.*?)\"$")
	public void i_validate_Workspace(String ws) throws Throwable {
		String wname = login.getWorkspaceNameText();
		Assert.assertEquals(wname, "imran & iham");
		
	    
	}


}

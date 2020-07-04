package slack;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.Before;
import slackPage.DeleteChannelPage;
import slackPage.AccLoginPage;
import slackPage.ActivePage;
import slackPage.AddChannelPage;
import slackPage.CrateAChannelPage;
import slackPage.HomePage;
import slackPage.LeaveChannelPage;
import slackPage.PostMessagePage;
import slackPage.SetStatusPage;
import slackPage.SigninPage;
import slackPage.WorkspaceUrlPage;
import slackPage.SlakCreateAccountPage;

public class TestBase {
	protected static WebDriver driver;
	static HomePage slackhomepage;
	static SigninPage slacksigninpage;
	static SlakCreateAccountPage slackcreateaccountpage;
	static WorkspaceUrlPage slackworkspaceurlpage;
	static AccLoginPage slackaccsigninpage;
	static AddChannelPage slackaddchannelpage;
	static CrateAChannelPage slackcreateachannelpage;
	static LeaveChannelPage slackleavechannelpage;
	static deleteChannelAdditionalPage deletechanneladditionalpage;
	static DeleteChannelPage deletechannelpage;
	static PostMessagePage slackpostmessgegepage;
	static ActivePage slackactivepage;
	static SetStatusPage slacksetstatuspage;
	
	//@Before
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://slack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
		
	}
	public HomePage getSlackHomePage() {
		slackhomepage= new HomePage(driver);
		return slackhomepage;
		
	}
	public SigninPage getSlackSigninPage() {
		slacksigninpage = new SigninPage(driver);
		return slacksigninpage;
		
	}
	public SlakCreateAccountPage getSlackCreateAccountPage() {
		slackcreateaccountpage = new SlakCreateAccountPage(driver);
		return slackcreateaccountpage;
		
	}
	
	public WorkspaceUrlPage getSlackWorkspaceUrlPage() {
		slackworkspaceurlpage = new WorkspaceUrlPage(driver);
		return slackworkspaceurlpage;
		
	}
	public AccLoginPage getSlackAccSigninPage() {
		slackaccsigninpage = new AccLoginPage(driver);
		return slackaccsigninpage;
		
	}
	public AddChannelPage getSlackAddChannelPage() {
		slackaddchannelpage = new AddChannelPage(driver);
		return slackaddchannelpage;
		
	}
	public CrateAChannelPage getSlackCrateAChannelPage() {
		slackcreateachannelpage = new CrateAChannelPage(driver);
		return slackcreateachannelpage;
	}
	public LeaveChannelPage getSlackLeaveChannelPage() {
		slackleavechannelpage = new LeaveChannelPage(driver);
		return slackleavechannelpage;
	}
	public deleteChannelAdditionalPage getdeleteChannelAdditionalPage() {
		deletechanneladditionalpage = new deleteChannelAdditionalPage(driver);
		return deletechanneladditionalpage;
	}
	public DeleteChannelPage getDeleteChannelPage() {
		deletechannelpage = new DeleteChannelPage(driver);
		return deletechannelpage;
	}
	public PostMessagePage getSlackPostMessagePage() {
		slackpostmessgegepage = new PostMessagePage(driver);
		return slackpostmessgegepage;
	}
	public ActivePage getSlackActivePage() {
		slackactivepage = new ActivePage(driver);
		return slackactivepage;
	}
	public SetStatusPage getSlackSetStatusPage() {
		slacksetstatuspage = new SetStatusPage(driver);
		return slacksetstatuspage;
		
	}
	
	
	

}

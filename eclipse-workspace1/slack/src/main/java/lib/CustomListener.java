package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import slackModel.AccLoginModel;


public class CustomListener implements ITestListener  {
	public void onTestStart(ITestResult result) {
	}

	
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		takepicture(testName);
	}

	
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		takepicture(testName);
			}
		
	public void onTestSkipped(ITestResult result) {
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	public void takepicture(String testName) {
			
		TakesScreenshot  ts = (TakesScreenshot)AccLoginModel.driver;//Where I can Implement ScreenShort
		File s = ts.getScreenshotAs(OutputType.FILE);
		
		String fileLocation = "screenshot/"+testName+".ping";
		
		
			try {
				FileUtils.copyFile(s, new File (fileLocation));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	
	}
	}	



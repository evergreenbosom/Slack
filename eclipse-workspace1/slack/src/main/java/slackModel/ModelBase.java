package slackModel;

import org.openqa.selenium.WebDriver;

public class ModelBase {
	///this one is static?
	//i used in actions class , other wise it show error
	//where is your actions , you used. 
	//is it not working. or working without static.
	//yes it is working in only public . ok.
	public static  WebDriver driver;
	
	 public ModelBase (WebDriver d) {
			driver = d;
		
	}

}

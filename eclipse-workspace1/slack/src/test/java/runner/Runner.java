package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "slackSteps", plugin = { "pretty",
"json:target/report/json/output.json", "html:target/report/html" }
//, dryRun = true, strict = true
, tags={"@SlackLogin"}//~ using this sign we can exclude any tag.
)  
public class Runner {

}

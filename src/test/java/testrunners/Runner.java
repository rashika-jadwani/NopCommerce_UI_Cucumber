package testrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features", glue = "stepdefinitions" , dryRun = false, plugin = {"pretty","html:target"}
)
public class Runner {
}
    
package testrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/AddCustomer.feature", glue = "stepdefinitions" , plugin = {"pretty","html:target"}
)
public class TestRunner {
}
    
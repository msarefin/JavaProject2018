package Runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\FBSignup.feature", glue = { "Steps" }, format = {
		"pretty", "html.target/cucumber" }, tags = { "@smoke" })
public class ScrumRunner {

}

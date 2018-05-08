package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\FBSignup.feature",
		glue={"Steps"},
		format = {"pretty","html:target/cucumber"},
		tags= {"@smoke"}
		)

public class DefaultRunner {

//This is a junit runner 
//	feature location
//	glue is the location to the StepDefinition package
//	tags is the tags in the feature file that will be executed
	
}

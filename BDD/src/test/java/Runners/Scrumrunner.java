package Runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\FB.feature",
		glue={"Stepdefination"},
		format = {"pretty","html:target/cucumber"},
		tags= {"@smoke"}
		)
 
/*
 * feature refers the location to the feature file
 * glue refers to the locations of the stepdefinition package
 * tags refers the tag name of the test that needs to run 
 */


public class Scrumrunner {

	
}

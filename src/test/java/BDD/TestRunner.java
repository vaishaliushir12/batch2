package BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"login.feature"},
		
		glue = {"StepDefinition.java"},
		
		dryRun = false,
		
		monochrome = true
		
		)


public class TestRunner {

}

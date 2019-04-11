package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/featureFiles/BootCa.feature", glue = { "StepDef" }, 
plugin = { "pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports", "html:target/MyReport" } )

public class TestRunner extends AbstractTestNGCucumberTests {
 
}

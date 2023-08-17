package Cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = {
		"Stepdef" }, plugin = "json:target/jsonReports/cucumber-report.json")

public class TestRunner {

}

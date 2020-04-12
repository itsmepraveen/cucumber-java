package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"stepdefinitions"}, features = "src/test/resources/features/", plugin = { "pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json" })
public class TestRunner {

}

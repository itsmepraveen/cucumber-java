package testrunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue={"stepdefinitions"}, features = "src/test/resources/features/", plugin = { "pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json" })
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
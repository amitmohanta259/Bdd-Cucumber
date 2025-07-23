package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", // relative path from project root
		glue = "stepDefinations", // package names for step defs and hooks
        plugin = { "pretty", "html:target/cucumber-reports.html"} , 
        tags = "@SmokeTest and @Regression",
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}

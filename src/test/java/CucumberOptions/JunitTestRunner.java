package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
glue="StepDefinitions"
,monochrome=true,
plugin = {"pretty", "html:target/cucumber/cucumber.html", "json:target/cucumber/cucumber.json",
		"junit:target/cucumber/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class JunitTestRunner {

}

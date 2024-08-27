package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/features"},glue= {"steps"},
plugin= {"html:target/cucumber-reports/cucumber-html-report.html","json:target/cucumber-reports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun =false,tags="@Test007",monochrome=true)
public class RunCuke extends AbstractTestNGCucumberTests{

}

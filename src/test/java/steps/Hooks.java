package steps;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import base.BaseSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseSteps{
	
	
	@Before
	public void beforeHook() {
		
		setUp();
	}
	
	@After
	public void afterHook(Scenario scenario) {
		
		
		if(scenario.isFailed()) {
			
			scenario.attach(getScreenshot(), "image/png", scenario.getName());
			ExtentCucumberAdapter.getCurrentStep().fail("Screenshot Attached ----->");
			takeScreenshot();
			
		}
		/*
		 * if (scenario.isFailed()) { byte[] screenshot = ((TakesScreenshot)
		 * webDriver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
		 * "image/png", "name"); }
		 */
		
		quit();
		
	}

}

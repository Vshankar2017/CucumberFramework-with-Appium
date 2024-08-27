package steps;

import java.time.Duration;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook {
	public static AndroidDriver driver;
	
	//@Before
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		   cap.setCapability("deviceName", "Vishnu's Galaxy M51");
		   cap.setCapability("udid", "RZ8N82YLQBB");
		   cap.setCapability("platformName", "Android");
		   cap.setCapability("automationName", "UiAutomator2");
		   cap.setCapability("platformVersion", "12");
		   cap.setCapability("appPackage", "shoppersstop.shoppersstop.uat");
		   cap.setCapability("appActivity", "shoppersstop.shoppersstop.MainActivity");
		   
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	//@After
	public void quit()
	{
		driver.quit();
	}

}

package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {

	public static AppiumDriver driver;
	private static URL serverUrl;
	private static DesiredCapabilities cap = new DesiredCapabilities();
	private static String APPIUM_PORT;
	private static int IMPLICIT_WAIT_TIME;
	private static int EXPLICIT_WAIT_TIME;
	private static String BASE_PKG;
	private static String APP_ACTIVITY;
	private static String APP_PATH;
	private static String BROWSER_NAME;
	//private static String PLATFORM_NAME;
	private static String PLATFORM_VERSION;
	private static String DEVICE_NAME;
	private static String UDID;
	private static String BUNDLE_ID;
	private static String APP;
	private static String NO_RESET;

	private static Properties prop = new Properties();
	private static FileInputStream fis;

	public static void loadAndriodConfProp(String loadPropertyFile) {

		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/properties/" + loadPropertyFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
		EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
		BASE_PKG = prop.getProperty("base.pgk");
		APP_ACTIVITY = prop.getProperty("application.activity");
		APP_PATH = prop.getProperty("application.path");
		BROWSER_NAME = prop.getProperty("base.pgk");
		//PLATFORM_NAME = prop.getProperty("platform.name");
		PLATFORM_VERSION = prop.getProperty("platform.version");
		DEVICE_NAME = prop.getProperty("device.name");
		APPIUM_PORT = prop.getProperty("appium.server.port");
		NO_RESET = prop.getProperty("noreset");
	}

//setting android cap
	public static void setAndroidCapabilities() {

			cap.setCapability("deviceName", "Vishnu's Galaxy M51");
			cap.setCapability("udid", "RZ8N82YLQBB");
			cap.setCapability("platformName", "Android");
			cap.setCapability("automationName", "UiAutomator2");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("appPackage", "shoppersstop.shoppersstop.uat");
			cap.setCapability("appActivity", "shoppersstop.shoppersstop.MainActivity");
			cap.setCapability("noRest", true);
			//cap.setCapability("unicodeKeyboard", false);
			//cap.setCapability("autoGrantPermissions", "true");
	}

	public static void loadIOSConfProp(String loadPropertyFile) {
// TODO Auto-generated method stub

	}

	public static void setIOSCapabilities() {

	}

	public static AppiumDriver getAndroidDriver() {

		try {
			serverUrl = new URL("http://localhost:" + APPIUM_PORT );
		} catch (MalformedURLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver(serverUrl, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIME));
		return driver;

	}

	public static AppiumDriver getIOSDriver() {

		return driver;

	}

}

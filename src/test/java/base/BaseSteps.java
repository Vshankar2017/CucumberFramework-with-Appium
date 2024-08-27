package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;
import utilities.CommonUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class BaseSteps {
	
	
	
	public static AppiumDriver driver;
	public static String loadPropertyFile = "Android_Shopperstop.properties";
	
	
	public byte[] getScreenshot() {
		
		return driver.getScreenshotAs(OutputType.BYTES);
		
	}
	public void takeScreenshot() {

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".png";
		String filePath = System.getProperty("user.dir")+"\\reports\\"+fileName;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(filePath);
		
	}
	
	
	public void setUp() {
		
		if(loadPropertyFile.startsWith("Android_")) {
			
			CommonUtils.loadAndriodConfProp(loadPropertyFile);
			CommonUtils.setAndroidCapabilities();
			driver = CommonUtils.getAndroidDriver();
			
			
		}else if(loadPropertyFile.startsWith("IOS_")) {
			
			
			
		}
		
		
	}
	
	
	public void quit() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}

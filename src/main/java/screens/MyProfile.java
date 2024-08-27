package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import utilities.TestData;

public class MyProfile extends BaseScreen {

	public MyProfile(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.view.View[@content-desc=\"Edit\"])[1]")
	public static WebElement edit;

	@FindBy(xpath = "(//android.widget.ImageView[@index='3'])[2]")
	public static WebElement maleradiobtn;

	@FindBy(className = "android.widget.EditText")
	public static WebElement edittext;

	@FindBy(xpath = "//android.view.View[@content-desc=\"UPDATE CHANGES\"]")
	public static WebElement updatechanges;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add Address\"]")
	public static WebElement clickaddlink;

	@FindBy(xpath = "//android.widget.EditText[@hint='Mobile No.']")
	public static WebElement mobile;

	@FindBy(xpath = "//android.widget.EditText[@hint='Pin Code']")
	public static WebElement pincode;

	@FindBy(xpath = "//android.widget.EditText[@hint='Address']")
	public static WebElement address;

	@FindBy(className = "android.widget.CheckBox")
	public static WebElement checkbox;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"ADD ADDRESS\"]")
	public static WebElement addressbtn;

	public static void clickeditbtn() {
		explicitlyWaitForElement(edit, 10);
		clickElement(edit);
	}

	public static void selectradiobtn() {
		clickElement(maleradiobtn);

		// sendKeys(edittext, TestData.Name,TestData.sec, 10);

	}

	public static void updatechanges() {
		clickElement(updatechanges);
	}

	public static void clickaddlink() {
		clickElement(clickaddlink);
	}

	public static void filladdAddress() {

		sendKeys(edittext, "Mohit", "Singh", 10);

		sendKeysMethod(mobile, TestData.mobile, 10);

		sendKeysMethod(pincode, TestData.pincode, 10);

		sendKeysMethod(address, TestData.address, 10);

	}

	public static void addbtn() {
		clickElement(checkbox);
		clickElement(addressbtn);
	}
}

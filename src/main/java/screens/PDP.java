package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import utilities.TestData;

public class PDP extends BaseScreen {

	public PDP(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "android.widget.EditText")
	public WebElement searchfield;

	@FindBy(xpath = "//android.view.View[contains(@content-desc,'ADIDAS T-Shirts & Polos')]")
	public WebElement selectshirt;

	@FindBy(xpath = "(//android.view.View[contains(@content-desc,'ADIDAS')])[3]")
	public WebElement selectoneproduct;

	@FindBy(xpath = "(//android.view.View[contains(@content-desc,'Large')])[1]")
	public WebElement large;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"9-10 Y\"]")
	public static WebElement kidsize;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"ADD TO BAG\"]")
	public static WebElement addbag;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Dismiss\"]")
	public static WebElement dismiss;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"VIEW BAG\"]")
	public static WebElement viewbag;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Product added to your cart successfully\"]")
	public static WebElement addtocardmsg;

	public void searchproduct() {
		clickElement(searchfield);
		SendText(searchfield, TestData.SearchProduct);

	}

	public void selectshirt() {
		tab(selectshirt);
	}

	public void selectproduct() {
		explicitlyWaitForElement(selectoneproduct, 30);
		clickElement(selectoneproduct);
	}

	public void productsize() {
		isElementPresent(large);
		// scroll(RIGHT, 80);
	}
	public static void kidproductsize()
	{
		scrolldown();
		clickElement(kidsize);
		clickElement(addbag);
		if (addtocardmsg.isDisplayed()) {
			clickElement(dismiss);
		}
		clickElement(viewbag);
		back();back();back();
		
	}
	
}

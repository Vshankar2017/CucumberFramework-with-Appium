package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;

public class PLP extends BaseScreen {

	public PLP(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@content-desc=\"44\"]")
	public static WebElement selectthesize;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"ADD TO BAG\"]")
	public static WebElement addbag;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Product added to your cart successfully\"]")
	public static WebElement addtocardmsg;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Dismiss\"]")
	public static WebElement dismiss;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"VIEW BAG\"]")
	public static WebElement viewbag;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"PLACE ORDER\"]")
	public static WebElement placeorder;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"CONTINUE\"]")
	public static WebElement continuebtn;

	public static void selectsizeoftheproduct() throws InterruptedException {
		Thread.sleep(8000);
		scrolldown();
		clickElement(selectthesize);
		clickElement(addbag);
		if (addtocardmsg.isDisplayed()) {
			clickElement(dismiss);
		}
		clickElement(viewbag);

		if (placeorder.isDisplayed()) {
			clickElement(placeorder);
		}
		clickElement(continuebtn);

	}
	public static void selecttheproduct() throws InterruptedException {
		Thread.sleep(8000);
		scrolldown();
		clickElement(selectthesize);
		clickElement(addbag);
		if (addtocardmsg.isDisplayed()) {
			clickElement(dismiss);
		}
		clickElement(viewbag);
		back();
		back();
		
		
	}
}

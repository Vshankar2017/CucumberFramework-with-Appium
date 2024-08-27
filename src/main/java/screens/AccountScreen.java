package screens;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.TestData;

public class AccountScreen extends BaseScreen {

	// public AppiumDriver driver;

	// public AccountScreen(AppiumDriver driver)
	// {
	// this.driver=driver;
	// }
	public AccountScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	}


	@FindBy(xpath = "//android.widget.Button[@content-desc=\"LOGIN\"]")
	public WebElement logbtn;

	@FindBy(className = "android.widget.EditText")
	public static WebElement entermobile;

	@FindBy(xpath = "//android.view.View[@content-desc=\"PROCEED\"]")
	public static WebElement procesbtn;

	@FindBy(xpath = "//android.view.View[@content-desc=\"VERIFY OTP\"]")
	public static WebElement verifyOTP;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Past Orders\"]")
	public static WebElement profile;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"CATEGORIES, Tab 3 of 5\"]")
	public static WebElement categories;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Women\"]")
	public static WebElement Women;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Indianwear\"]")
	public static WebElement Selectpro;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Clothing\"]")
	public static WebElement cloth;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Show All\"]")
	public static WebElement showall;

	@FindBy(xpath = "(//android.view.View[@index='3'])[2]")
	public static WebElement product;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"ADD TO BAG\"]")
	public static WebElement addbag;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Medium\"]")
	public static WebElement medium;// android.view.View[@content-desc="Medium"]

	@FindBy(xpath = "//android.view.View[@content-desc=\"Product added to your cart successfully\"]")
	public static WebElement addtocardmsg;// android.view.View[@content-desc="Size Chart"]

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Dismiss\"]")
	public static WebElement dismiss;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"VIEW BAG\"]")
	public static WebElement viewbag;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"PLACE ORDER\"]")
	public static WebElement placeorder;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"CONTINUE\"]")
	public static WebElement continuebtn;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"msg_first_line_one\" and @text=\"Credit/Debit Cards\"]")
	public static WebElement card;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"edt_card_number\"]")
	public static WebElement edt_card_number;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"edt_expiry_date\"]")
	public static WebElement edt_expiry_date;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"edt_cvv\"]")
	public static WebElement edt_cvv;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"msg_text\" and @text=\"PROCEED TO PAY \"]")
	public static WebElement proceestopay;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"msg_first_line_one\" and @text=\"Cash on Delivery\"]")
	public static WebElement cashondelivery;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Order Placed Successfully !\"]")
	public static WebElement ordersucessfully;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"HOME, Tab 1 of 5\"]")
	public static WebElement home;

	@FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'My Profile')]")
	public static WebElement myprofile;

	
	public void login() {
		// driver.findElement(AppiumBy.xpath("")).click();
		clickElement(logbtn);
	}

	public void entermobileno() {
		clickElement(entermobile);
		SendText(entermobile, TestData.Number);
	}

	public void clickproce() {

		clickElement(procesbtn);
	}

	public void clickverifyotp() throws InterruptedException {

		Thread.sleep(10000);
		clickElement(verifyOTP);
	}

	public void profileDisplay() throws InterruptedException {
		Thread.sleep(1000);
		profile.isDisplayed();
	}

	public static void clickhomePage() throws InterruptedException {
		// TODO Auto-generated method stub

		explicitlyWaitForElement(home, 10);
		clickElement(home);
	}

	public static void clickcatagerwomen() throws InterruptedException {
		explicitlyWaitForElement(categories, 10);
		clickElement(categories);
		clickElement(Women);
	}

	public void clickcatagermen() throws InterruptedException {
		explicitlyWaitForElement(categories, 10);
		clickElement(categories);

	}

	public static void scroll() throws InterruptedException {

		explicitlyWaitForElement(Selectpro, 10);
		clickElement(Selectpro);
		Thread.sleep(1000);
		clickElement(showall);

	}

	public static void select() {

		explicitlyWaitForElement(product, 10);
		clickElement(product);
	}

	public static void scroll1() throws InterruptedException, MalformedURLException {

		Thread.sleep(8000);
		scrolldown();

	}

	public static void selectsizeaddbag() {
		clickElement(medium);
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

	public static void selectaddbag() {
		clickElement(medium);
		clickElement(addbag);
		if (addtocardmsg.isDisplayed()) {
			clickElement(dismiss);
		}
		clickElement(viewbag);
		back();back();back();
	}
	public static void Selectcreditcard() {
		explicitlyWaitForElement(card, 60);
		clickElement(card);
		SendText(edt_card_number, TestData.CardNumber);
		SendText(edt_expiry_date, TestData.CardExpiry);
		SendText(edt_cvv, TestData.CVV);
		clickElement(proceestopay);
	}

	public static void Selectcashondelivery() {
		explicitlyWaitForElement(card, 60);
		scrolldown();
		scrolldown();
		clickElement(cashondelivery);

	}

	public static void ordersuccessfully() {
		String success = ordersucessfully.getAttribute("content-desc");
		System.out.println("" + success);

	}

	public static void clickcloth() {
		explicitlyWaitForElement(cloth, 10);
		clickElement(cloth);
		clickElement(showall);

	}

	public static void verifyToastMessageUsingPageSource(String toastmsg) throws InterruptedException {
		boolean found = false;
		for (int i = 0; i < 8; i++) {
			if (driver.getPageSource().contains("class=\"android.widget.Toast\" text=\"" + toastmsg + "\"")) {
				found = true;
				break;
			}
			Thread.sleep(300);
		}
		Assert.assertTrue(found, "toast message " + toastmsg + " is present");
	}

	public static void profile() {
		clickElement(myprofile);
	}
}

package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;

public class Categories extends BaseScreen {

	public Categories(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//android.view.View[@content-desc=\"Women\"]")
	public static WebElement Women;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Men\"]")
	public static WebElement men;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Kids\"]")
	public static WebElement kid;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Beauty\"]")
	public static WebElement Beauty;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Watches\"]")
	public static WebElement Watches;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Gifts\"]")
	public static WebElement Gifts;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
	public static WebElement Home;

	@FindBy(xpath = "//android.view.View[@content-desc=\"LUXE\"]")
	public static WebElement LUXE;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Bargains\"]")
	public static WebElement Bargains;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Clothing\"]")
	public static WebElement cloth;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Show All\"]")
	public static WebElement showall;

	@FindBy(xpath = "(//android.view.View[contains(@content-desc,'STOP')])[2]")
	public static WebElement selectmenProduct;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Boys\"]")
	public static WebElement Boys;

	public void Womenbtn() {
		clickElement(Women);
	}

	public static void clickmen() {
		clickElement(men);
		clickElement(cloth);
		clickElement(showall);
	}

	public static void selectplpproduct() {

		clickElement(selectmenProduct);

	}

	public static void clickkid() {
		clickElement(kid);

	}

	public static void kidproduct() {
		clickElement(Boys);
		clickElement(showall);

	}

}

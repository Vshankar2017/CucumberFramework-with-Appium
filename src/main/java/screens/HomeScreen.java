package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends BaseScreen {

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"HOME, Tab 1 of 5\"]")
	public static WebElement home;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"BRANDS, Tab 2 of 5\"]")
	public static WebElement brands;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"CATEGORIES, Tab 3 of 5\"]")
	public static WebElement categories;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"STYLEHUB, Tab 4 of 5\"]")
	public static WebElement stylehub;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"ACCOUNT, Tab 5 of 5\"]")
	public WebElement account;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"What are you looking for?\"]")
	public WebElement search;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Click a photo\"]")
	public WebElement skip;

	@FindBy(xpath = "//(//*[@class='android.widget.ImageView'])[4]")
	public WebElement bag;

	public HomeScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void home() {
		clickElement(home);
	}

	public void brands() {
		// clickElement(brands);
		tab(brands);
	}

	public void categories() {
		clickElement(categories);
		// clickElement(Women);

	}

	public void stylehub() {
		clickElement(stylehub);
	}

	public void account() {
		explicitlyWaitForElement(account, 60);
		clickElement(account);
	}

	public void searchlabel() {
		// driver.findElement(AppiumBy.xpath("")).click();
		clickElement(search);
		if (skip.isDisplayed()) {
			clickElement(skip);
		} else {

		}
		
	}

	public void clickbag() {
		// TODO Auto-generated method stub
		tab(bag);
	}

}

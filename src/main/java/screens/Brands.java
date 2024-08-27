package screens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import base.BaseScreen.ScrollDirection;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Brands extends BaseScreen {

	public Brands(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//android.view.View[@content-desc=\"Allen Solly\"]")
	public static WebElement Allen;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"SORT \"]")
	public static WebElement sort;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Popularity\"]")
	public static WebElement popularity;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Discount\"]")
	public static WebElement discount;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Price Low to High\"]")
	public static WebElement pricelowtohigh;
	@FindBy(xpath = "//android.view.View[@content-desc=\"Price High to Low\"]")
	public static WebElement pricehightolow;
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"FILTER\"]")
	public static WebElement filter;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"SHOW 1 ITEMS\"]")
	public static WebElement showitem;

	@FindBy(xpath = "//android.widget.ImageView/android.view.View[1]/android.view.View")
	public static WebElement list;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Brands\"]")
	public static WebElement brands;
	@FindBy(xpath = "(//android.view.View[contains(@content-desc,'ALLEN SOLLY JEANS')]/android.widget.CheckBox)")
	public static WebElement allensollyjeans;

	public void Allenbrand() {
		Allen.isDisplayed();

	}

	public void Clickbrand() {
		clickElement(Allen);
	}

	public void Clicksort() {
		clickElement(sort);
	}

	public void Clickdiscount() {
		explicitlyWaitForElement(popularity, 20);
		clickElement(discount);
	}

	public void ClickPricelowtohigh() throws InterruptedException {
		clickElement(sort);
		explicitlyWaitForElement(popularity, 30);
		clickElement(pricelowtohigh);
		Clickfilterbrands();
		sort();
	}

	public void ClickPricehightolow() throws InterruptedException {
		clickElement(sort);
		explicitlyWaitForElement(popularity, 20);
		clickElement(pricehightolow);
		// sort();

	}

	public void Clickfilter() {

		explicitlyWaitForElement(filter, 20);
		clickElement(filter);
		explicitlyWaitForElement(list, 60);
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//android.view.View[@index='1']"));

		for (WebElement mobileElement : allCheckBoxes) {
			// System.out.println(mobileElement.getText());
			WebElement men = driver
					.findElement(By.xpath("//android.view.View[@content-desc=\"Men (581)\"]/android.widget.CheckBox"));
			clickElement(men);
			clickElement(showitem);

		}
	}

	public void Clickfilterbrands() {
		explicitlyWaitForElement(filter, 20);
		clickElement(filter);
		explicitlyWaitForElement(brands, 10);
		clickElement(brands);
		clickElement(allensollyjeans);// brands
		clickElement(showitem);
	}

	public void sort() throws InterruptedException {
		List<WebElement> price = driver
				.findElements(By.xpath("//android.view.View[contains(@content-desc,'ALLEN SOLLY')]"));
		ArrayList<Integer> productprice = new ArrayList<Integer>();
		// System.out.println(price.size());
		for (int i = 18; i < price.size() + 18; i = i++) {
			WebElement element = driver
					.findElement(By.xpath("(//android.view.View)[" + i + "][contains(@content-desc,'ALLEN SOLLY')]"));

			String productdata = element.getAttribute("content-desc").split("\n")[3];
			// System.out.println(productdata);
			productdata = productdata.replaceAll(",", "");
			productdata = productdata.substring(1);
			System.out.println(productdata);
			productprice.add(Integer.parseInt(productdata));
			scrolldown();

			/*
			 * WebElement elements = driver.findElement(AppiumBy.androidUIAutomator(
			 * "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Desired Text\"))"
			 * ));
			 */

		}
		System.out.println(productprice);
		ArrayList<Integer> productpriceSorted = new ArrayList<Integer>();
		productpriceSorted = productprice;
		Collections.sort(productpriceSorted);
		if (productpriceSorted.equals(productprice)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}

package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;

public class BagPage extends BaseScreen {

	public BagPage(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//android.view.View[@content-desc=\"BAG\"]")
	public static WebElement bagpage;
	@FindBy(xpath ="(//*[@class='android.widget.ImageView'])[5]")
	public static WebElement deleate;
	@FindBy(xpath ="//android.view.View[@content-desc=\"Looks like your bag is empty. Fill it with things that make you feel stylish.\"]")
	public static WebElement emteText;
	
	public static void clickdeleatitem()
	{
		explicitlyWaitForElement(bagpage,10);
		clickElement(deleate);
	}
	public static void verfiyText()
	{
		String text = emteText.getAttribute("content-desc");
	}

}

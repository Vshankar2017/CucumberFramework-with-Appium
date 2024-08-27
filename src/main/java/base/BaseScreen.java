package base;

import java.time.Duration;
import java.util.Collections;
import java.util.NoSuchElementException;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen {

	public static AppiumDriver driver;
	public static WebDriverWait wait;
	static Duration SCROLL_DUR = Duration.ofMillis(500);
	private static Logger Logger = LoggerFactory.getLogger(BaseScreen.class);

	public BaseScreen(AppiumDriver driver) {
		//PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		this.driver = driver;
		
	}

	public static void clickElement(WebElement element) {
		element.click();
	}
	public static void back()
	{
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void clickAndWait(WebElement element, long waitTimeInSeconds) {
		try {
			wait(waitTimeInSeconds);
			explicitlyWaitForElement(element, waitTimeInSeconds);
			element.click();
			Logger.info("Element clicked successFully " + element);
		} catch (Exception e) {
			Logger.error("Element is not clicked {}", e.getStackTrace());
		}
	}

	public static void explicitlyWaitForElement(WebElement element, long waitTimeSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSeconds));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Logger.info("Element clicked successFully " + element);
		} catch (Exception e) {
			e.printStackTrace();
			Logger.error("Element is not clicked {}", e.getStackTrace());
		}
	}

	public static void SendText(WebElement element, String Text) {
		element.sendKeys(Text);
	}

	public static void sendKeys(WebElement element, String value, String txt, long waitTimeInSeconds) {

		try {
			explicitlyWaitForElement(element, waitTimeInSeconds);
			element.clear();
			element.click();
			element.sendKeys(value);
			element.sendKeys(Keys.SPACE);
			element.sendKeys(txt);
		} catch (Exception e) {
			Logger.error("element" + element + "is not display");
			Assert.fail("element" + element + "is not display");
		}
	}

	public static void sendKeysMethod(WebElement element, String value, long waitTimeInSeconds) {

		try {
			explicitlyWaitForElement(element, waitTimeInSeconds);
			element.clear();
			element.click();
			element.sendKeys(value);
		} catch (Exception e) {
			Logger.error("element" + element + "is not display");
			Assert.fail("element" + element + "is not display");
		}
	}

	

	public boolean isElementPresent(WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed() || element.isEnabled()) {
				flag = true;
			}

		} catch (NoSuchElementException | StaleElementReferenceException e) {
			flag = false;
			Logger.error("Element '" + element + "' is Not present");
		}
		return flag;
	}

	public void selectByVisibleText(WebElement element, String visibleText) {
		WebElement dropdown = element;
		try {
			Select se1 = new Select(dropdown);
			se1.selectByVisibleText(visibleText);
			Logger.info("text" + visibleText + "is Select from the dropdown" + element);
		} catch (Exception e) {
			Logger.error("'" + element + " Is not Present");
		}

	}

	public static void doubletab(WebElement element) {
		Point location = element.getLocation();
		Dimension size = element.getSize();
		Point ceneterofElement = getCeneterofElement(location, size);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), ceneterofElement))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(100)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(100)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(100)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singleton(sequence));
	}

	

	public void scrollToEnd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public static void longpress(WebElement element) {
		Point location = element.getLocation();
		Dimension size = element.getSize();
		Point ceneterofElement = getCeneterofElement(location, size);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), ceneterofElement))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofSeconds(2)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singleton(sequence));
	}

	public static void tab(WebElement element) {
		Point location = element.getLocation();
		Dimension size = element.getSize();
		Point ceneterofElement = getCeneterofElement(location, size);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), ceneterofElement))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singleton(sequence));
	}

	private static Point getCeneterofElement(Point location, Dimension size) {
		return new Point(location.getX() + size.getWidth() / 2, location.getY() + size.getHeight() / 2);
	}

	public static void scrolldown() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int startY = size.getHeight() / 2;
		int endX = startX;
		int endY = (int) (size.getHeight() * 0.25);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(500)))
				.addAction(
						finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(sequence));

	}

	public enum ScrollDirection {
		UP, DOWN, LEFT, RIGHT
	}

	public static void scroll(ScrollDirection dir, double scrollRatio) {

		if (scrollRatio < 0 || scrollRatio > 1) {
			throw new Error("Scroll distance must be between 0 and 1");
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));
		int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
		int top = midPoint.y - (int) (midPoint.y * scrollRatio);
		// Point Start = new Point(midPoint.x, bottom );
		// Point End = new Point(midPoint.x, top );
		int left = midPoint.x - (int) (midPoint.x * scrollRatio);
		int right = midPoint.x + (int) (midPoint.x * scrollRatio);

		if (dir == ScrollDirection.UP) {
			swipe(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
		} else if (dir == ScrollDirection.DOWN) {
			swipe(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
		} else if (dir == ScrollDirection.LEFT) {
			swipe(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
		} else {
			swipe(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
		}
	}

	protected static void swipe(Point start, Point end, Duration duration) {

		PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence swipe = new Sequence(input, 0);
		swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
		swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		/*
		 * if (isAndroid) { duration = duration.dividedBy(ANDROID_SCROLL_DIVISOR); }
		 * else { swipe.addAction(new Pause(input, duration)); duration = Duration.ZERO;
		 * }
		 */
		swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
		swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		// ((AppiumDriver)
		// AppDriver.getCurrentDriver()).perform(ImmutableList.of(swipe));
		driver.perform(ImmutableList.of(swipe));
	}
}

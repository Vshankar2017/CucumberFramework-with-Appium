package steps;

import java.net.MalformedURLException;

import org.testng.Assert;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import screens.AccountScreen;
import screens.HomeScreen;

public class login extends BaseSteps{
	
	
	//public static AndroidDriver driver;
	HomeScreen home = new HomeScreen(driver);
	AccountScreen account = new AccountScreen(driver);
	
	@Given("launch the application,login with validate user and click the account btn")
	public void launch_the_application_and_click_the_account_btn() {
	   //driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"ACCOUNT, Tab 5 of 5\"]")).click();
		home.account();
	}

	@And("click the login btn")
	public void click_the_login_btn() {
	   account.login();
	}

	@And("Enter the login id")
	public void enter_the_login_id() {
	    account.entermobileno();
	}

	@And("click the proceed btn")
	public void click_the_proceed_btn() {
	  account.clickproce();
	}

	@And("enter the otp")
	public void enter_the_otp() {
	
	}

	@And("click the verfied otp")
	public void click_the_verfied_otp() throws InterruptedException {
	  account.clickverifyotp();
	}

	@Then("user is login succfully")
	public void user_is_login_succfully() throws InterruptedException {
	   account.profileDisplay();
	}
	
}

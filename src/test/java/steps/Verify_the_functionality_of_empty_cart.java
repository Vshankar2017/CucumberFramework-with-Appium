package steps;

import org.testng.Assert;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.BagPage;
import screens.HomeScreen;

public class Verify_the_functionality_of_empty_cart extends BaseSteps {
	
	HomeScreen home = new HomeScreen(driver);
	BagPage bag = new BagPage(driver);
	
	@When("I wait in seconds Stay in homepage")
	public void i_wait_in_seconds_stay_in_homepage() {
	   home.home();
	}
	@And("I selected Cart Icon in home page in cart page")
	public void i_selected_cart_icon_in_home_page_in_cart_page() {
	 home.clickbag();
	}
	@And("I Remove all items Clear Cart Products in cart page")
	public void i_remove_all_items_clear_cart_products_in_cart_page() {
	   bag.clickdeleatitem();
	}
	@Then("verify text Empty Bag Vfy in cart page")
	public void verify_text_empty_bag_vfy_in_cart_page() {
		bag.verfiyText();
		Assert.assertTrue(true);
	}

}

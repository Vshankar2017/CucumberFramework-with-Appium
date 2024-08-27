package steps;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import screens.Categories;
import screens.HomeScreen;

public class Product extends BaseSteps {
	
	HomeScreen home = new HomeScreen(driver);
	Categories categorie = new Categories(driver);
	
	
	@Given("click the categies btn")
	public void click_the_categies_btn() {
	    home.categories();
	}

	@And("click the women btn")
	public void click_the_women_btn() {
		categorie.Womenbtn();
	}

	@And("select the product")
	public void select_the_product() {
	    
	}

	@And("click the show all btn")
	public void click_the_show_all_btn() {
	    
	}

	@And("select one sub product")
	public void select_one_sub_product() {
	    
	}

	@And("click the product")
	public void click_the_product() {
	    
	}

	@And("scroll and select the size")
	public void scroll_and_select_the_size() {
	   
	}

	@And("click the add to bag btn")
	public void click_the_add_to_bag_btn() {
	    
	}

	@And("click the view bag btn")
	public void click_the_view_bag_btn() {
	    
	}

	@And("click the place order btn")
	public void click_the_place_order_btn() {
	    
	}

	@And("click the continue btn")
	public void click_the_continue_btn() {
	   
	}

	@And("select payment method")
	public void select_payment_method() {
	    
	}

}

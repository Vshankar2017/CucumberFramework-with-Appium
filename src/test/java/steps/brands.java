package steps;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import screens.Brands;
import screens.HomeScreen;

public class brands extends BaseSteps  {
	
	HomeScreen home = new HomeScreen(driver);
	Brands brand = new Brands(driver);
	
	@Given("click the brands btn")
	public void click_the_brands_btn() {
	  home.brands();
	}
	@And("select the brand")
	public void select_the_brand() {
		brand.Allenbrand();
	}
	@And("click the one brand")
	public void click_the_one_brand() {
	    brand.Clickbrand();
	}
	@And("click the sort btn")
	public void click_the_sort_btn() {
	   brand.Clicksort();
	}
	@And("click the discount btn")
	public void click_the_discount_btn() {
	    brand.Clickdiscount();
	}
	@And("click the price low to high btn")
	public void click_the_price_low_to_high_btn() throws InterruptedException {
	    brand.ClickPricelowtohigh();
	}
	@And("Click the price high to low btn")
	public void click_the_price_high_to_low_btn() throws InterruptedException {
	    brand.ClickPricehightolow();
	}
	
	@And("Click the filter btn")
	public void click_the_filter_btn() {
	    brand.Clickfilter();
	}


}

package steps;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import screens.HomeScreen;
import screens.PDP;

public class pdp extends BaseSteps {

	HomeScreen home = new HomeScreen(driver);
	PDP pdp = new PDP(driver);
	
	@Given("click the Search btn &  search the  product")
	public void click_the_search_btn_search_the_product() {
	   home.searchlabel();
	   pdp.searchproduct();
	}
	@And("select the product in the list")
	public void select_the_product_in_the_list() {
	   pdp.selectshirt();
	}
	@And("click the one product")
	public void click_the_one_product() {
	  pdp.selectproduct();
	}

}

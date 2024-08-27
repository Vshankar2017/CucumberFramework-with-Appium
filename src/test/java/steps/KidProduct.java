package steps;

import java.net.MalformedURLException;

import base.BaseSteps;
import io.cucumber.java.en.And;
import screens.AccountScreen;
import screens.Categories;
import screens.PDP;
import screens.PLP;

public class KidProduct extends BaseSteps{
	
	AccountScreen account = new AccountScreen(driver);
	Categories categorie = new Categories(driver);
	PLP plp = new PLP(driver);
	PDP pdp = new PDP(driver);
	
	@And("User select the Kid category")
	public void user_select_the_kid_category() throws InterruptedException {
		//account.clickhomePage();
		categorie.clickkid();
	}
	@And("User select the boy product")
	public void user_select_the_boy_product() {
		categorie.kidproduct();
	}
	@And("User landed the Kid Plp page and select one product")
	public void user_landed_the_kid_plp_page_and_select_one_product() throws MalformedURLException, InterruptedException {
		account.select();
		account.scroll1();
	}
	@And("user landed the pdp page and select the size and add to bag")
	public void user_landed_the_pdp_page_and_select_the_size_and_add_to_bag() {
		pdp.kidproductsize();
	}

}

package steps;

import base.BaseSteps;
import io.cucumber.java.en.And;
import screens.AccountScreen;
import screens.Categories;
import screens.PLP;


public class MenProduct extends BaseSteps{
	
	AccountScreen account = new AccountScreen(driver);
	Categories categorie = new Categories(driver);
	PLP plp = new PLP(driver);
	
	@And("User select the category page")
	public void user_select_the_category_page() throws InterruptedException {
	   account.clickcatagermen();
	}
	@And("User select the Men Product")
	public void user_select_the_men_product() {
		categorie.clickmen();
	}
	@And("User landed to PLP page and Select one product")
	public void user_landed_to_plp_page_and_select_one_product() {
		categorie.selectplpproduct();
	}
	@And("User Select the Size of product after add the product in the bag")
	public void user_select_the_size_of_product_after_add_the_product_in_the_bag() throws InterruptedException {
	   plp.selectsizeoftheproduct();
	}
	@And("Select thee Size of product after add the product in the bag")
	public void user_select_thee_after_add_the_product_in_the_bag() throws InterruptedException {
	   plp.selecttheproduct();
	}
		
	@And("User select the credit card")
	public void user_select_the_credit_card() throws InterruptedException {
		account.Selectcreditcard();
		AccountScreen.verifyToastMessageUsingPageSource("Payment Successfully");
	}
		
	
}

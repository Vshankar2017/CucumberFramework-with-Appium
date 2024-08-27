package steps;

import java.net.MalformedURLException;

import base.BaseSteps;
import io.cucumber.java.en.And;
import screens.AccountScreen;
import screens.Categories;
import screens.HomeScreen;
import screens.PLP;

public class Verify_user_Able_to_select_categories extends BaseSteps{
	HomeScreen home = new HomeScreen(driver);
	AccountScreen account = new AccountScreen(driver);
	Categories categorie = new Categories(driver);
	PLP plp = new PLP(driver);
	
	
	@And("click on catahorie page")
	public void  click_on_catahories_page() throws InterruptedException  {
		System.out.println("Test8");
		account.clickhomePage();
		
	}
	@And("click on categorywomen page")
	public void  click_on_category_page() throws InterruptedException  {
		System.out.println("Test9");
		account.clickcatagerwomen();
		
		
	}
	@And("scroll product")
	public void  scroll_the_product() throws InterruptedException  {
		System.out.println("Test11");
		
		account.scroll();
		
	}
	@And("click thes product")
	public void  click_the_produc() throws InterruptedException  {
		System.out.println("Test12");
		
		account.select();
		
	}
	@And("scroll the pages")
	public void  scroll_the_page_and_select_the_size_and_bag() throws InterruptedException, MalformedURLException  {
		System.out.println("Test13");
		
		account.scroll1();
		
	}
	@And("select the sizes and bag")
	public void  select_the_size_and_bag() throws InterruptedException, MalformedURLException  {
		System.out.println("Test13");
		
		account.selectaddbag();
		
	}
	@And("User select the categorymen page")
	public void user_select_the_category_page() throws InterruptedException {
	   account.clickcatagermen();
	}
	@And("User select the Men Products")
	public void user_select_the_men_product() {
		categorie.clickmen();
	}
	@And("User landeds to PLP page and Select one product")
	public void user_landed_to_plp_page_and_select_one_product() {
		categorie.selectplpproduct();
	}
	@And("User Select thee Size of product after add the product in the bag")
	public void user_select_the_size_of_product_after_add_the_product_in_the_bag() throws InterruptedException {
	   plp.selecttheproduct();
	}

}

package steps;

import java.net.MalformedURLException;

import org.testng.Assert;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import screens.AccountScreen;

public class WomenProduct extends BaseSteps  {
	
	AccountScreen account = new AccountScreen(driver);
	
	@And("click on catahories page")
	public void  click_on_catahories_page() throws InterruptedException  {
		System.out.println("Test8");
		account.clickhomePage();
		
	}
	@And("click on category page")
	public void  click_on_category_page() throws InterruptedException  {
		System.out.println("Test9");
		account.clickcatagerwomen();
		
		
	}
	@And("scroll the product")
	public void  scroll_the_product() throws InterruptedException  {
		System.out.println("Test11");
		
		account.scroll();
		
	}
	@And("click the produc")
	public void  click_the_produc() throws InterruptedException  {
		System.out.println("Test12");
		
		account.select();
		
	}
	@And("scroll the page")
	public void  scroll_the_page_and_select_the_size_and_bag() throws InterruptedException, MalformedURLException  {
		System.out.println("Test13");
		
		account.scroll1();
		
	}
	@And("select the size and bag")
	public void  select_the_size_and_bag() throws InterruptedException, MalformedURLException  {
		System.out.println("Test13");
		
		account.selectsizeaddbag();
		
	}
	@And("select  bag")
	public void  selectaddbag() throws InterruptedException, MalformedURLException  {
		System.out.println("Test13");
		
		account.selectaddbag();
		
	}
	@And("select card")
	public void  select_card() throws InterruptedException, MalformedURLException  {
		System.out.println("Test14");
		
		account.Selectcashondelivery();
		
	}

	@Then("Order is Successfully")
	public void Order_is_Successfully()
	{
		 //Assert.assertEquals(true);
		account.ordersuccessfully();
		 Assert.assertTrue(true);
	}

}

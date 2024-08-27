package steps;

import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import screens.AccountScreen;
import screens.MyProfile;

public class add_address extends BaseSteps{

	AccountScreen account = new AccountScreen(driver);
	MyProfile myprofile = new MyProfile(driver);
	
	@When("user select the my profile")
	public void user_select_the_my_profile() {
	   account.profile();
	}

	@And("edit the my profile")
	public void edit_the_my_profile() {
	    myprofile.clickeditbtn();
	}

	@And("Select the Gender and edit the text file")
	public void select_the_gender_and_edit_the_text_file() {
		myprofile.selectradiobtn();
	}

	@And("Update changes btn")
	public void update_changes_btn() {
	 myprofile.updatechanges();
	}

	@And("user is click the add address btn")
	public void user_is_click_the_add_address_btn() {
	   myprofile.clickaddlink();
	}

	@And("user is fill the address detail")
	public void user_is_fill_the_address_detail() {
	 myprofile.filladdAddress();
	}

	@And("select the check box & add address btn")
	public void select_the_check_box_add_address_btn() {
	   myprofile.addbtn();
	}
}

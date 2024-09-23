package cucumberStepDefination;

import data.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.java.CargoPage;
import page.java.loginPage;
import page.java.shiftpaln;

public class shiftplanStepdef extends BaseTest{
	
	shiftpaln s;
	
	@Given("logged in with username and passs")
    public void logged_in_with_username_and_pass() throws InterruptedException  {
		initializeWebDriver();
		s= new shiftpaln(driver);
		loginPage p= new loginPage(driver);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the shiftplan screen")
	public void select_the_shiftplan_screen() throws InterruptedException {
	    s.sendshiftplanValue();
	
	}
	
	@Then("search and add the values")
	public void search_and_add_the_values() throws InterruptedException {
		s.creatDetails();
		s.createplan();
		s.rightclick();
	}

}

package cucumberStepDefination;

import java.net.MalformedURLException;

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
    public void logged_in_with_username_and_pass() throws InterruptedException, MalformedURLException  {
		initializeWebDriver();
		s= new shiftpaln(driver);
		loginPage p= new loginPage(driver);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the shiftplan screen")
	public void select_the_shiftplan_screen() throws InterruptedException {
	    s.sendshiftplanValue();
	
	}
	
	@Then("Create new plan and save it")
	public void Create_new_plan_and_save_it() throws InterruptedException {
		s.creatDetails();
		s.createplan();
		
	}
	
	@Then("Verify the Set Pob Count for Period menu")
	public void Verify_the_Set_Pob_Count_for_Period_menu() throws InterruptedException {
		s.setPobCountforPeriodMenu();
		
		
	}
	
	@Then("Verify the delete Pob Count for Period menu")
	public void Verify_the_delete_Pob_Count_for_Period_menu() throws InterruptedException {
		s.deletePobCountforPeriodMenu();
		
		
	}
	
	

}

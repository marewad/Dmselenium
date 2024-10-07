package cucumberStepDefination;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;


import data.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.java.CargoPage;
import page.java.commonmethods;
import page.java.loginPage;
import page.java.shiftPlan;

public class shiftplanStepdef{
	
	
	
	private TestContextSetup testContextSetup;  // This will be injected via PicoContainer
    private WebDriver driver;
    commonmethods commonMethods;
    shiftPlan shiftplan;
    
    public shiftplanStepdef(TestContextSetup testContextSetup) throws MalformedURLException, InterruptedException {
        this.testContextSetup = testContextSetup; // Pass the initialized TestContextSetup object
        this.shiftplan = new shiftPlan(testContextSetup); // Pass it to CargoPage
        this.commonMethods = new commonmethods(testContextSetup); // Pass it to commonmethods
    }
	
	@Given("logged in with username and passs")
    public void logged_in_with_username_and_pass() throws InterruptedException, MalformedURLException  {
		loginPage p= new loginPage(testContextSetup);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the shiftplan screen")
	public void select_the_shiftplan_screen() throws InterruptedException {
		shiftplan.sendshiftplanValue();
	
	}
	
	@Then("Create new plan and save it")
	public void Create_new_plan_and_save_it() throws InterruptedException {
		shiftplan.creatDetails();
		shiftplan.createplan();
		
	}
	
	@Then("Verify the Set Pob Count for Period menu")
	public void Verify_the_Set_Pob_Count_for_Period_menu() throws InterruptedException {
		shiftplan.setPobCountforPeriodMenu();
		
		
	}
	
	@Then("Verify the delete Pob Count for Period menu")
	public void Verify_the_delete_Pob_Count_for_Period_menu() throws InterruptedException {
		shiftplan.deletePobCountforPeriodMenu();
		
		
	}
	
	

}

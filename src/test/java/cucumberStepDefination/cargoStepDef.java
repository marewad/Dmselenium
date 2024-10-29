package cucumberStepDefination;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;


import data.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.java.CargoPage;
import page.java.commonmethods;
import page.java.loginPage;
import page.java.shiftPlan;

public class cargoStepDef {
	
	
	
	private TestContextSetup testContextSetup;  // This will be injected via PicoContainer
    private WebDriver driver;
    commonmethods commonMethods;
    CargoPage cargoPage;
    
    public cargoStepDef(TestContextSetup testContextSetup) throws InterruptedException, IOException {
        this.testContextSetup = testContextSetup; // Pass the initialized TestContextSetup object
        this.cargoPage = new CargoPage(testContextSetup); // Pass it to CargoPage
        this.commonMethods = new commonmethods(testContextSetup); // Pass it to commonmethods
    }

	
	@Given("logged in with username and pass")
    public void logged_in_with_username_and_pass() throws InterruptedException, IOException  {
		loginPage p= new loginPage(testContextSetup);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the cargo screen")
	public void select_the_cargo_screen() throws InterruptedException  {
		cargoPage.sendCargoValue();
		
		
		
	}
	
	@And("Create new cargo")
	public void Create_new_cargo() throws InterruptedException {
		cargoPage.newCargo();
	}
	
	@Then("Verify cargo status as registered")
	public void Verify_cargo_status_as_registered() throws InterruptedException {
		cargoPage.verifyRegistered();
	}
	
	
	@Then("Verify cargo status as Approved")
	public void Verify_cargo_status_as_Approved() throws InterruptedException {
		cargoPage.verifyApproved();
	}
	
	@Then("Verify cargo status as Rejected")
	public void Verify_cargo_status_as_Rejected() throws InterruptedException {
		cargoPage.verifyRejected();
	}
	
	@Then("Verify Menu Go to Change log")
	public void Verify_Menu_Go_to_Change_log() throws InterruptedException {
		cargoPage.verifyMenuGotoChangelog();
	}
	
	
	@Given("url link")
    public void url_link() throws InterruptedException, MalformedURLException {
		//initializeWebDriver();
		//c = new CargoPage(driver);
		cargoPage.goole();
		
	}

}
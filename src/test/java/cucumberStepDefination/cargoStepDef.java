package cucumberStepDefination;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;

import data.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.java.CargoPage;
import page.java.loginPage;
import page.java.shiftpaln;

public class cargoStepDef extends BaseTest {
	
	
	private CargoPage c;

	
	@Given("logged in with username and pass")
    public void logged_in_with_username_and_pass() throws InterruptedException, MalformedURLException  {
		initializeWebDriver();
		c = new CargoPage(driver);
		loginPage p= new loginPage(driver);
		p.loginTest("marewdny", "ko20la");
		
		
	}
	
	@When("select the cargo screen")
	public void select_the_cargo_screen() throws InterruptedException  {
		c.sendCargoValue();
		
		
		
	}
	
	@And("Create new cargo")
	public void Create_new_cargo() throws InterruptedException {
		c.newCargo();
	}
	
	@Then("Verify cargo status as registered")
	public void Verify_cargo_status_as_registered() throws InterruptedException {
		c.verifyRegistered();
	}
	
	
	@Then("Verify cargo status as Approved")
	public void Verify_cargo_status_as_Approved() throws InterruptedException {
		c.verifyApproved();
	}
	
	@Then("Verify cargo status as Rejected")
	public void Verify_cargo_status_as_Rejected() throws InterruptedException {
		c.verifyRejected();
	}
	
	@Then("Verify Menu Go to Change log")
	public void Verify_Menu_Go_to_Change_log() throws InterruptedException {
		c.verifyMenuGotoChangelog();
	}
	
	
	@Given("url link")
    public void url_link() throws InterruptedException, MalformedURLException {
		initializeWebDriver();
		c = new CargoPage(driver);
		c.goole();
		
	}

}

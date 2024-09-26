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
	
	@And("click on add and create")
	public void click_on_add_and_create() throws InterruptedException {
		c.newCargo();
	}
	
	@Then("Verify cargo")
	public void Verify_cargo() throws InterruptedException {
		c.verifyRegistered();
	}
	
	@Given("url link")
    public void url_link() throws InterruptedException, MalformedURLException {
		initializeWebDriver();
		c = new CargoPage(driver);
		c.goole();
		
	}

}

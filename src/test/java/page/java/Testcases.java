package page.java;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.BaseTest;

public class Testcases extends BaseTest {

//	protected WebDriver driver;
//
//    @BeforeClass
//    public void initializeWebDriver() throws InterruptedException {
//        Standalonnetest k = new Standalonnetest();
//        driver = k.initalization();
//    }

    @Test(priority=1)
    public void performLogin() throws InterruptedException {
        loginPage p = new loginPage(driver);
        p.loginTest("marewdny", "ko20la");
    }

    @Test(priority=2)
    public void performCargoOperations() throws InterruptedException {
        CargoPage c = new CargoPage(driver);
        c.sendCargoValue();
        c.newCargo();
    }

}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

//	public Testcases() {
//		
//		commonmethods k = new commonmethods();
//		
//		
//	}
//	
//	@Test
//	public void login() throws InterruptedException {
//		
//		chromeup();
//		loginPage n = new loginPage(driver);
//		n.loginTest();
//		n.sendCargoValue();
//		
//		
//		
//	}
	
//	public WebDriver k(){
//		
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://vaadin.dev.dawinci.cloud");
//	driver.manage().window().maximize();
//	return driver;
//
//}
//	@Test
//	public void test() throws InterruptedException {
//		WebDriver driver =k();
//		loginPage n = new loginPage(driver);
//		n.loginTest();
//		n.sendCargoValue();
//	}
//	
//


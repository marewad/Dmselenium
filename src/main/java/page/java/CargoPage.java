package page.java;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import data.TestContextSetup;
import enumOperation.ScreenName;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.PropertiesUtil;
import junit.framework.Assert;




public class CargoPage extends commonmethods{
	
	String cargoNo;
	WebDriver driver;
	TestContextSetup testContextSetup;
	Actions actions;
	commonmethods common;

	public CargoPage(TestContextSetup testContextSetup) throws InterruptedException, IOException {
		super(testContextSetup);
        this.testContextSetup = testContextSetup;
        common = new commonmethods(testContextSetup);
        this.driver = testContextSetup.webDriverManager.getDriver();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
     
    }
	
	String Cargo_PROP_Path = "src/test/resources/testdataProperties/Cargo.properties";
	 
	 @FindBy(xpath = "//vaadin-grid/vaadin-grid-cell-content/vaadin-grid-tree-toggle")
	 List<WebElement> names;
	 
	 @FindBy(xpath = "//*[@id='nav.DN_CARGO_ID_NO']")
	 WebElement cargoNoNavigator;
	 
	 @FindBy(xpath = "//*[@id='nav.DN_CARGO_ID_NO']")
	 WebElement qwert;
	 
	 @FindBy(xpath = "//*[@id='DETAILS.details.START_LOCATION']")
	 WebElement fromLoc;
	 
	 @FindBy(xpath = "//*[@id='DETAILS.details.DN_CARGO_ID_NO']")
	 WebElement no;
	 
	 @FindBy(xpath = "//*[@id='DETAILS.details.END_LOCATION']")
	 WebElement toLoc;
	 
	 @FindBy(xpath = "//*[@id='DETAILS.details.DESCRIPTION']")
	 WebElement description;
	 
	 @FindBy(xpath = "//*[@id='DETAILS.details.ITEM_NO_1_WEIGHT_KG']")
	 WebElement weight;
	 
	 @FindBy(xpath = "//*[@id='nav.CARGO_STATUS_POPUP']")
	 WebElement register;
	 
	 @FindBy(xpath = "//vaadin-grid[@class='feature-no-sort-indicator with-emphasis']")
	 WebElement list;
	 
	 @FindBy(xpath = "//*[text()='Approve Cargo']")
	 WebElement approveCargoMenu;
	 
	 @FindBy(xpath = "//*[text()='Reject Cargo']")
	 WebElement rejectCargoMenu;
	 
	 @FindBy(xpath = "//*[text()='Go to Change log']")
	 WebElement verifyMenuGotoChangelogMenu;
	 
	
	 
	@Test(priority=1)
	public void sendCargoValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		rightsidetextField2();
		screenNamee(names, ScreenName.CARGO);
		
	}
	
	
	@Test(priority=2)
	public void newCargo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cargoNoNavigator.click();
		qwert.sendKeys(Keys.BACK_SPACE);
		Add();
		cargoNo=no.getAttribute("value");
		System.out.print(cargoNo+"edddddddddddddddddddd");
		//fromLoc.sendKeys("BGO");
	    common.entervalue(fromLoc, PropertiesUtil.getProperty(Cargo_PROP_Path, "from_location"));
		//toLoc.sendKeys("STA");
	    common.entervalue(toLoc, PropertiesUtil.getProperty(Cargo_PROP_Path, "to_location"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", description);
	   // description.sendKeys("s");
	    common.entervalue(description, PropertiesUtil.getProperty(Cargo_PROP_Path, "description"));
	    common.entervalue(weight, PropertiesUtil.getProperty(Cargo_PROP_Path, "Heavy_weight"));
	    Save();
	}
	
	
	@Test(dependsOnMethods = "newCargo")
	public void verifyRegistered() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cargoNoNavigator.sendKeys(cargoNo);
		register.sendKeys("Registered");
		Search();	
		
		
	}


	public void verifyApproved() throws InterruptedException {
		Thread.sleep(5000);
		actions.contextClick(list).build().perform();
		Thread.sleep(3000);
		approveCargoMenu.click();
		
	}
	
	
	public void verifyRejected() throws InterruptedException {
		Thread.sleep(5000);
		actions.contextClick(list).build().perform();
		Thread.sleep(3000);
		rejectCargoMenu.click();
		
	}
	
	public void verifyMenuGotoChangelog() throws InterruptedException {
		Thread.sleep(5000);
		actions.contextClick(list).build().perform();
		Thread.sleep(3000);
		String originalWindow = driver.getWindowHandle();
		verifyMenuGotoChangelogMenu.click();
		Thread.sleep(5000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
		    if (!windowHandle.equals(originalWindow)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		Thread.sleep(5000);
	    String p = driver.getTitle();
	    Assert.assertEquals(p, "Change Log");
		
	}
	public void goole() throws InterruptedException {
			driver.get("https://www.google.com");
	        driver.manage().window().maximize();
	        JavascriptExecutor  js = (JavascriptExecutor) driver;
	        js.executeScript("document.getElementById('APjFqb').setAttribute('d', 'surface');");
	        Thread.sleep(3000);
	        driver.findElement(By.id("APjFqb")).click();
	        Thread.sleep(3000);
	      
			
		}
		
	}
	




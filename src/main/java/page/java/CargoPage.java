package page.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import enumOperation.ScreenName;
import junit.framework.Assert;




public class CargoPage extends commonmethods  {
	
	String cargoNo;
	WebDriver driver;

    public CargoPage(WebDriver driver) {
    	super(driver);
       this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	
	 
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
	 
	
	
	@Test(priority=1)
	public void sendCargoValue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		fromLoc.sendKeys("BGO");
		toLoc.sendKeys("STA");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", description);
	    description.sendKeys("s");
	    weight.sendKeys("10");
	    Save();
	    qwert.sendKeys(cargoNo);
	}
	
	
	@Test(dependsOnMethods = "newCargo")
	public void verifyRegistered() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cargoNoNavigator.sendKeys(cargoNo);
		register.sendKeys("Registered");
		Search();	
		String url =driver.getCurrentUrl();
					
		
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
	
//	




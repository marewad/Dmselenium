package page.java;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




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
	 
//	 @FindBy(xpath = "//*[contains(text(), 'New')]")
//	 WebElement add;
	 
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
	 
	 
//	 @FindBy(xpath = "//*[@id='details.shiftplan.START_DATE']/input")
//	 WebElement Startdate;
//	 
//	 @FindBy(xpath = "//*[@id='details.shiftplan.DESCRIPTION']/input")
//	 WebElement d1;

	
	//WebElement cargo = driver.findElement(By.xpath("//input[@id=\"input-vaadin-text-field-11\"]"));
	//List<WebElement> name =driver.findElements(By.xpath("//vaadin-grid/vaadin-grid-cell-content/vaadin-grid-tree-toggle"));
//	WebElement cargoNoNavigator = driver.findElement(By.xpath("//*[@id=\"nav.DN_CARGO_ID_NO\"]"));
//	WebElement qwert = driver.findElement(By.xpath("//*[@id=\"nav.DN_CARGO_ID_NO\"]"));
//	WebElement no= driver.findElement(By.xpath("//*[@id=\"DETAILS.details.DN_CARGO_ID_NO\"]"));
//	
//	WebElement fromLoc=	driver.findElement(By.xpath("//*[@id=\"DETAILS.details.START_LOCATION\"]"));
//	WebElement toLoc= driver.findElement(By.xpath("//*[@id=\"DETAILS.details.END_LOCATION\"]"));
//	WebElement description=  driver.findElement(By.xpath("//*[@id=\"DETAILS.details.DESCRIPTION\"]"));
//	WebElement weight =driver.findElement(By.xpath("//*[@id=\"DETAILS.details.ITEM_NO_1_WEIGHT_KG\"]"));
//	WebElement register= driver.findElement(By.xpath("//*[@id=\"nav.CARGO_STATUS_POPUP\"]"));
	
	@Test(priority=1)
	public void sendCargoValue() throws InterruptedException {
		rightsidetextField2();
		//rightsidetextField.sendKeys("cargo");
		Thread.sleep(5000);
		screenNamee1(names);
		Thread.sleep(3000);
				
	}
	
	
	@Test(priority=2)
	public void newCargo() throws InterruptedException {
		cargoNoNavigator.click();
		qwert.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		Add();
		Thread.sleep(3000);
		cargoNo=no.getAttribute("value");
		System.out.print(cargoNo+"edddddddddddddddddddd");
		fromLoc.sendKeys("BGO");
		toLoc.sendKeys("STA");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", description);
	    description.sendKeys("s");
	    weight.sendKeys("10");
	    Save();
	    Thread.sleep(5000);
	    qwert.sendKeys(cargoNo);
	}
	
	
	@Test(dependsOnMethods = "newCargo")
	public void verifyRegistered() throws InterruptedException {
		Thread.sleep(3000);
		cargoNoNavigator.sendKeys(cargoNo);
		register.sendKeys("Registered");
		Search();	
		
	}
	
	public void sendshiftplanValue() throws InterruptedException {
		rightsidetextField();
		//rightsidetextField.sendKeys("shift");
		Thread.sleep(5000);
		screenNamee2(names);
		Thread.sleep(3000);
			
	}


//	public void creatplan() throws InterruptedException {
//		//Search();
//		Thread.sleep(5000);
//		Add();
//		Thread.sleep(5000);
//		Startdate.sendKeys("21.08.2024");
//		Thread.sleep(2000);
//		d1.sendKeys("des");
//		Thread.sleep(2000);
//		Save();
//	}
	
	
}	


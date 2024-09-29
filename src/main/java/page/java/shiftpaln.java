package page.java;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import enumOperation.ScreenName;

public class shiftpaln extends commonmethods{
	
	WebDriver driver;
	Actions actions;
	
	
	public shiftpaln(WebDriver driver) {
		super(driver);
		this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
	}

	
	 @FindBy(xpath = "//*[@id='details.shiftplan.START_DATE']/input")
	 WebElement Startdate;
	 
	 @FindBy(xpath = "//*[@id='details.shiftplan.DESCRIPTION']/input")
	 WebElement d1;
	 
	 @FindBy(xpath = "//*[text()='Show inactive']")
	 WebElement inactive;
	 
	 @FindBy(xpath = "//*[@our-id='tab.shiftplan_roles']")
	 WebElement plan;
	 
	 @FindBy(xpath = "//*[@slot='vaadin-grid-cell-content-202']//vaadin-text-field[@class='required']")
	 WebElement dept;
	 
	 @FindBy(xpath = "//vaadin-grid-cell-content[@slot='vaadin-grid-cell-content-203']//*[@id='shiftplan_roles.DEPARTMENT_ROLE_POPUP']")
	 WebElement Role;
	 
	 @FindBy(xpath = "//vaadin-grid-cell-content[@slot='vaadin-grid-cell-content-204']//*[@id='shiftplan_roles.SHIFT_DN_POPUP']")
	 WebElement Shift;
	 
	 @FindBy(xpath = "//vaadin-grid-cell-content[@slot=\"vaadin-grid-cell-content-206\"]//*[@id='shiftplan_roles.START_DATE']")
	 WebElement Start_date;
	 
	 @FindBy(xpath = "//vaadin-grid-cell-content[@slot='vaadin-grid-cell-content-207']//*[@id='shiftplan_roles.END_DATE']")
	 WebElement End_date;
	 
	 @FindBy(xpath = "//vaadin-grid/vaadin-grid-cell-content/vaadin-grid-tree-toggle")
	 List<WebElement> names;
	 
	 @FindBy(xpath = "//*[text()='Set POB Count for Period']")
	 WebElement SetPobCountforPeriodMenu;
	 
	 @FindBy(xpath = "//vaadin-grid[@id='shiftplan_roles']")
	 WebElement Grid;
	 
	 @FindBy(id = "shiftplan_roles.MENU_SET_POB_FOR_PERIOD.POB_COUNT")
	 WebElement POBcountValue;
	 
	 @FindBy(xpath = "//*[text()='Delete POB Count for Period']")
	 WebElement DeletePobCountforPeriodMenu;
	 
	 @FindBy(id = "shiftplan_roles.MENU_DELETE_POB_FOR_PERIOD.START_DATE")
	 WebElement PeriodStartDate;
	 
	 @FindBy(id = "shiftplan_roles.MENU_DELETE_POB_FOR_PERIOD.END_DATE")
	 WebElement PeriodEndDate;
	 
	 public void sendshiftplanValue() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 rightsidetextField();
		 screenNamee(names, ScreenName.SHIFT_PLAN);
				
		}

	public void creatDetails() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		inactive.click();
		Add();
		Startdate.sendKeys(getCurrentDate("dd.MM.yyyy"));
		d1.sendKeys("des");
		Save();
		
	}
	
	public void createplan() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		plan.click();
		Add();
		dept.sendKeys("Bore");
		Role.sendKeys("ATC");
		Shift.sendKeys("Day");
		Start_date.sendKeys(getCurrentDate("dd.MM.yyyy"));
		End_date.sendKeys(getFutureDate("dd.MM.yyyy",1));
		Save();
		
	    
	}
	
	public void setPobCountforPeriodMenu() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	    actions.contextClick(Grid).build().perform();
	    Thread.sleep(3000);
	    SetPobCountforPeriodMenu.click();
	    POBcountValue.sendKeys("5");
	    actions.keyDown(Keys.CONTROL).sendKeys("s");
	    Thread.sleep(3000);
	}


	public void deletePobCountforPeriodMenu() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		actions.contextClick(Grid).build().perform();
		Thread.sleep(3000);
	    DeletePobCountforPeriodMenu.click();
	    PeriodStartDate.sendKeys(getCurrentDate("dd.MM.yyyy"));
	    PeriodEndDate.sendKeys(getFutureDate("dd.MM.yyyy",1));
	    Thread.sleep(2000);
	    actions.keyDown(Keys.CONTROL).sendKeys("s");
	    	
	}
	

}

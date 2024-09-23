package page.java;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shiftpaln extends commonmethods{
	
	WebDriver driver;
	Actions actions;
	//Action s = new Action(driver);
	
	public shiftpaln(WebDriver driver) {
		super(driver);
		this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
	}
//	Actions actions = new Actions(driver);
	
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
	 WebElement menu;
	 
	 
	 public void sendshiftplanValue() throws InterruptedException {
		    rightsidetextField();
			Thread.sleep(5000);
			screenNamee2(names);
			Thread.sleep(3000);
				
		}

	public void creatDetails() throws InterruptedException {
		//Search();
		inactive.click();
		Thread.sleep(5000);
		Add();
		Thread.sleep(5000);
		Startdate.sendKeys("21.08.2024");
		Thread.sleep(2000);
		d1.sendKeys("des");
		Thread.sleep(2000);
		Save();
		Thread.sleep(5000);
	}
	
	public void createplan() throws InterruptedException {
		plan.click();
		Add();
		Thread.sleep(5000);
		dept.sendKeys("Bore");
		Thread.sleep(5000);
		Role.sendKeys("ATC");
		Thread.sleep(3000);
		Shift.sendKeys("Day");
		Thread.sleep(3000);
		Start_date.sendKeys("22.08.2024");
		Thread.sleep(3000);
		End_date.sendKeys("22.08.2024");
		Save();
		
	}
	
	public void rightclick() throws InterruptedException {
		actions.moveToElement(End_date).click().contextClick().build().perform();
		//actions.contextClick(End_date).build().perform();		
		Thread.sleep(10000);
		//menu.click();
		//Thread.sleep(5000);
	}

}

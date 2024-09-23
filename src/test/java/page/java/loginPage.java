package page.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginPage {
	
	WebDriver driver;



    public loginPage(WebDriver driver) {
    	
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    WebElement login;
    
    @FindBy(xpath = "//input[@id='input-vaadin-text-field-11']")
    WebElement cargo;

    @FindBy(xpath = "//vaadin-grid/vaadin-grid-cell-content/vaadin-grid-tree-toggle")
    List<WebElement> name;

    @FindBy(xpath = "//*[@id='nav.DN_CARGO_ID_NO']")
    WebElement cargoNoNavigator;

    @FindBy(xpath = "//*[@id='DETAILS.details.DN_CARGO_ID_NO']")
    WebElement no;

    @FindBy(xpath = "//*[@id='DETAILS.details.START_LOCATION']")
    WebElement fromLoc;

    @FindBy(xpath = "//*[@id='DETAILS.details.END_LOCATION']")
    WebElement toLoc;

    @FindBy(xpath = "//*[@id='DETAILS.details.DESCRIPTION']")
    WebElement description;

    @FindBy(xpath = "//*[@id='DETAILS.details.ITEM_NO_1_WEIGHT_KG']")
    WebElement weight;

    @FindBy(xpath = "//*[@id='nav.CARGO_STATUS_POPUP']")
    WebElement register;


    public void loginTest(String Name ,String word) throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        userName.sendKeys(Name);
        password.sendKeys(word);
        login.click();    
    }
    }


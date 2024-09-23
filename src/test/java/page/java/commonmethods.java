package page.java;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonmethods {
	
	WebDriver driver;
	
	


	public commonmethods(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void chromeup(){
	driver.get("https://vaadin.dev.dawinci.cloud");
	driver.manage().window().maximize();
	
	}
//public Actions getAction() {
//	Actions actions = new Actions(driver);
//	return actions;
//			
//}

public void screenNamee1(List<WebElement> name) throws InterruptedException {
	
	for (WebElement element : name) {
        String text = element.getText();
        System.out.println("Value: " + text);
        if(text.equalsIgnoreCase("Cargo")) {
        	Thread.sleep(5000);
        	
        	Actions actions = new Actions(driver);
        	actions.click(element).build().perform();
        
        	
        	break;
        	
        }
}
	}

public void Add() {
	
	driver.findElement(By.xpath("//*[contains(text(), 'New')]")).click();
}

public void Save() {
	
	driver.findElement(By.xpath("//*[contains(text(), 'Save')]")).click();
}

public void Search() {
	
	driver.findElement(By.xpath("//*[@id=\"nav.BTN_QUERY\"]")).click();
}

public void rightsidetextField() {
	
	driver.findElement(By.xpath("//input[@id='input-vaadin-text-field-11']")).sendKeys("shift Plan");
}

public void rightsidetextField2() {
	
	driver.findElement(By.xpath("//input[@id='input-vaadin-text-field-11']")).sendKeys("Cargo");
}




public void screenNamee2(List<WebElement> name) throws InterruptedException {
	
	for (WebElement element : name) {
        String text = element.getText();
        System.out.println("Value: " + text);
        if(text.equalsIgnoreCase("Shift Plan")) {
        	Thread.sleep(5000);
        	
        	Actions actions = new Actions(driver);
        	actions.click(element).build().perform();
        
        	
        	break;
        	
        }
}

	
}

}



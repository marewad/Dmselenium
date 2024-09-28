package page.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import enumOperation.ScreenName;

public class commonmethods {
	
	WebDriver driver;
	
	


	public commonmethods(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

//	public void chromeup(){
//	driver.get("https://vaadin.dev.dawinci.cloud");
//	driver.manage().window().maximize();
//	
//	}

//public void screenNamee1(String string) throws InterruptedException {
//	
//	for (WebElement element : string) {
//        String text = element.getText();
//        System.out.println("Value: " + text);
//        if(text.equalsIgnoreCase("Cargo")) {
//        	Thread.sleep(5000);
//        	Actions actions = new Actions(driver);
//        	actions.click(element).build().perform();
//        
//        	
//        	break;
//        	
//        }
//}
	//}

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




public void screenNamee(List<WebElement> name, ScreenName targetScreen) throws InterruptedException {
    for (WebElement element : name) {
        String text = element.getText();
        System.out.println("Value: " + text);
        if (text.equalsIgnoreCase(targetScreen.getScreenName())) {  
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            actions.click(element).build().perform();
            break;
        }
    }
}


	
}





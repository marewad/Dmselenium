package page.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import enumOperation.ScreenName;

public class commonmethods {
	
	WebDriver driver;
	
	


	public commonmethods(WebDriver driver) {
		
		this.driver = driver;
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


public static String getCurrentDate(String format) {
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return today.format(formatter);
}


public static String getFutureDate(String format, int daysToAdd) {
    LocalDate futureDate = LocalDate.now().plusDays(daysToAdd);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return futureDate.format(formatter);
}


public static String getPastDate(String format, int daysToSubtract) {
    LocalDate pastDate = LocalDate.now().minusDays(daysToSubtract);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return pastDate.format(formatter);
}


public static String getDateWithOffset(String format, int daysOffset) {
    LocalDate date = LocalDate.now().plusDays(daysOffset);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return date.format(formatter);
}





	
}





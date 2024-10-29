package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import com.epam.healenium.SelfHealingDriver;


public class WebDriverManager {


	WebDriver driver;
	DesiredCapabilities caps;
	
	public WebDriver getDriver() throws InterruptedException, IOException {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }
	
	@Test
public WebDriver initializeDriver() throws IOException {
    	
    	Properties prop = new Properties();
    	FileInputStream fis = new FileInputStream("C:\\Users\\dnyaneshwar.marewad\\Downloads\\git\\selenium\\src\\test\\resources\\config.properties");
    	prop.load(fis);
    	String Browser =prop.getProperty("browser");
        caps = new DesiredCapabilities();
        if (Browser.equalsIgnoreCase("chrome")) {
      	   System.setProperty("webdriver.chrome.driver", "C:/Users/dnyaneshwar.marewad/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            caps.setBrowserName("chrome");
        } else if (Browser.equalsIgnoreCase("firefox")) {
            caps.setBrowserName("firefox");
        
        } else {
            throw new IllegalArgumentException("Browser not supported: " + Browser);
        }

        // Setting up remote WebDriver
        
        WebDriver remoteDriver = new RemoteWebDriver(new URL(" http://172.20.10.3:4444"), caps);
        SelfHealingDriver selfHealingDriver = SelfHealingDriver.create(remoteDriver);
        driver = selfHealingDriver;
        driver.manage().window().maximize();
        driver.get("https://vaadin.dev.dawinci.cloud");
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Marewdny");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ko20la");

        return selfHealingDriver;
    }

	
	public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}
package data;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import com.epam.healenium.SelfHealingDriver;


public class WebDriverManager {


	WebDriver driver;
	
	public WebDriver getDriver() throws MalformedURLException, InterruptedException {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }
	
	
	@BeforeClass
	public WebDriver initializeDriver() throws InterruptedException, MalformedURLException {
		
	   System.setProperty("webdriver.chrome.driver", "C:/Users/dnyaneshwar.marewad/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setBrowserName("chrome");
        WebDriver remoteDriver = new RemoteWebDriver(new URL(" http://192.168.1.3:4444"), caps);
        SelfHealingDriver selfHealingDriver = SelfHealingDriver.create(remoteDriver);
        selfHealingDriver.manage().window().maximize();
        selfHealingDriver.get("https://vaadin.dev.dawinci.cloud");
        return selfHealingDriver; //
	}
	
	public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}

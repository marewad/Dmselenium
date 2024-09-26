package data;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeInitalization {


	WebDriver driver;
	public WebDriver initalization() throws InterruptedException, MalformedURLException {
		
	   WebDriverManager.chromedriver().setup();
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setBrowserName("chrome");
        WebDriver remoteDriver = new RemoteWebDriver(new URL("http://192.168.1.11:4444"), caps);
        SelfHealingDriver selfHealingDriver = SelfHealingDriver.create(remoteDriver);
        selfHealingDriver.manage().window().maximize();
        selfHealingDriver.get("https://vaadin.dev.dawinci.cloud");

        return selfHealingDriver; //
	}
	
	
}

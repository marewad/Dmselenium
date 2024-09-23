package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeInitalization {

	//String screenValue = "cargo";
	WebDriver driver;
	public WebDriver initalization() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver delegate = new ChromeDriver();
		SelfHealingDriver driver = SelfHealingDriver.create(delegate);
		driver.manage().window().maximize();
		driver.get("https://vaadin.dev.dawinci.cloud");
		return driver;
	}
}

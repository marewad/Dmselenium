package data;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
		protected WebDriver driver;

	    @BeforeClass
	    public void initializeWebDriver() throws InterruptedException {
	    	chromeInitalization object = new chromeInitalization();
	        driver = object.initalization();
	    

	}

}

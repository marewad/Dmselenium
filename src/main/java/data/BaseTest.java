package data;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

	
		protected WebDriver driver;

	    @BeforeClass
	    public void initializeWebDriver() throws InterruptedException, MalformedURLException {
	    	chromeInitalization object = new chromeInitalization();
	        driver = object.initalization();
	    

	}
	    
	  //  @AfterMathod
	    public void screenshot() {
//	    	if(result.getStatus()==ITestResult.FAILURE) {
//	    		TakeScreenshot tc=(TakeScreenshot)driver;
//	    	//	File src = tc.getScreenshotAs(OutputType.FILE); 
//	    		File src =getScreenshotAs(OutputType.FILE);
//	    		FileHandler.copy(src,new File(result.getName()+".png"));
	    	//ITestResult result
	    	}
	    		
	    	
	    

}

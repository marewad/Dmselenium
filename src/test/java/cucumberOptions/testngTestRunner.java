package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import data.WebDriverManager;  // Import your WebDriverManager class

@CucumberOptions(
    features = "src/test/resources/cucumber",   // Path to your feature files
    glue = "cucumberStepDefination",            // Step definition package
    monochrome = true,                          // Clean console output
    tags = "@cargo",                            // Tags to run specific scenarios
    plugin = {"html:target/cucumber.html"}      // For report generation
)
public class testngTestRunner extends AbstractTestNGCucumberTests {
   
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	   
	}
    

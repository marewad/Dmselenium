package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/cucumber",   // Path to your feature files
    glue = "cucumberStepDefination",            // Step definition package
    monochrome = true,                          // Clean console output
    tags = "@cargo123",                         // Tags to run specific scenarios
    plugin = {"html:target/cucumber.html"}      // For report generation
)
public class testngTestRunner extends AbstractTestNGCucumberTests {
    
}


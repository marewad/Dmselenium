package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber" ,glue="cucumberStepDefination" ,monochrome=true,tags = "@shiftplan" ,plugin= {"html:target/cucumber.html"})
public class testngTestRunner extends AbstractTestNGCucumberTests {

}

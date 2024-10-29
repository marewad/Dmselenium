package cucumberStepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

import Util.ScreenshotUtil;
import data.TestContextSetup;

public class Hooks {
    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Before
    public void setUp() {
        // Code for setup actions
    }

    @After
    public void tearDown() {
        testContextSetup.webDriverManager.quitDriver();
    }
    
    @After
    public void afterScenario(Scenario scenario) throws InterruptedException, IOException {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(testContextSetup, scenario.getName());
        }
    }
    
  
}


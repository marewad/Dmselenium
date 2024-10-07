package data;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriverManager webDriverManager;
    public WebDriver driver;

    public TestContextSetup() throws MalformedURLException, InterruptedException {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
    }
}


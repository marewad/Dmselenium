package data;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriverManager webDriverManager;
    public WebDriver driver;

    public TestContextSetup() throws InterruptedException, IOException {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
    }
}

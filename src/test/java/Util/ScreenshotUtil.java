package Util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import data.TestContextSetup;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {

    public static void takeScreenshot(TestContextSetup testContextSetup, String scenarioName) throws MalformedURLException, InterruptedException {
        // Ensure you have the WebDriver instance
        TakesScreenshot ts = (TakesScreenshot) testContextSetup.webDriverManager.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        try {
            // Create a folder if it doesn't exist
            String folderPath = "C:/Users/dnyaneshwar.marewad/Downloads/git/selenium/src/test/java/Screenshot/";
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();  // Create the directory if it doesn't exist
            }

            // Create a unique file name with a timestamp
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String filePath = folderPath + scenarioName + "_" + timestamp + ".png";

            // Save the screenshot
            FileUtils.copyFile(source, new File(filePath));
            System.out.println("Screenshot taken: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





//String filePath = "C:/Users/dnyaneshwar.marewad/Downloads/DnewChanges/Dmselenium-main/src/test/java/Screenshot" + scenarioName + ".png"; // Update this path as needed

package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String getProperty(String filePath, String key) {
        Properties prop = new Properties();
        try (FileInputStream fileInput = new FileInputStream(filePath)) {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

package cucumber;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HealeniumPortCheck {


    public static void checkService(String port) {
        try {
            String urlString = "http://localhost:" + port;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

           
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                System.out.println("Healenium is running on port: " + port);
            } else {
                System.out.println("Healenium is NOT running on port: " + port);
            }
        } catch (IOException e) {
            System.out.println("Connection failed on port: " + port + ". Healenium is not running.");
        }
    }

    public static void main(String[] args) {
       
        checkService("7878"); 
        checkService("8000");  
    }
}


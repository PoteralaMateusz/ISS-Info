package info.iss.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ISSApiReader {

    private final String apiURL;
    private StringBuffer apiDate = new StringBuffer();

    public ISSApiReader(String apiURL) {
        this.apiURL = apiURL;
        getConnectionAndReadData();
    }

    public StringBuffer getApiDate() {
        return apiDate;
    }

    private void getConnectionAndReadData() {

        try {
            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    apiDate.append(inputLine);
                }
            } else {
                System.out.println("API CONNECTION ERROR: " + connection.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

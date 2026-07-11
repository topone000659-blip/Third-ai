package com.thirdai.app;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {

    private static final String API_URL = "http://YOUR_SERVER_IP:8000/chat";

    public void sendMessage(String message) {

        new Thread(() -> {

            try {

                URL url = new URL(API_URL);

                HttpURLConnection connection =
                        (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("POST");
                connection.setRequestProperty(
                        "Content-Type",
                        "application/json"
                );

                connection.setDoOutput(true);

                String json =
                        "{\"message\":\"" + message + "\"}";

                OutputStream os =
                        connection.getOutputStream();

                os.write(json.getBytes());
                os.flush();
                os.close();

                int responseCode =
                        connection.getResponseCode();

                System.out.println(
                        "API Response: " + responseCode
                );

                connection.disconnect();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }).start();
    }
}

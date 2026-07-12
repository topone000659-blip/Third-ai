package com.thirdai.app;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        apiService = new ApiService();

        EditText input = findViewById(R.id.messageInput);
        Button send = findViewById(R.id.sendButton);
        TextView response = findViewById(R.id.responseText);
        TextView menu = findViewById(R.id.menuButton);


        menu.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);

            startActivity(intent);

        });


        send.setOnClickListener(v -> {

            String message = input.getText().toString();

            apiService.sendMessage(message);

            response.setText("Message sent: " + message);

        });

    }
}

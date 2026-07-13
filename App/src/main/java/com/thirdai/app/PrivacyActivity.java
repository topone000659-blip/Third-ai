package com.thirdai.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PrivacyActivity extends Activity {

    Button securityButton;
    Button privacyButton;
    Button deleteAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_privacy);


        securityButton = findViewById(R.id.securityButton);
        privacyButton = findViewById(R.id.privacyButton);
        deleteAccountButton = findViewById(R.id.deleteAccountButton);


        securityButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    PrivacyActivity.this,
                    SecurityActivity.class
            );

            startActivity(intent);

        });


        privacyButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    PrivacyActivity.this,
                    PrivacySettingsActivity.class
            );

            startActivity(intent);

        });


        deleteAccountButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    PrivacyActivity.this,
                    DeleteAccountActivity.class
            );

            startActivity(intent);

        });

    }
}

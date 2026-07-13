package com.thirdai.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PrivacySettingsActivity extends Activity {

    String[] privacyOptions = {
            "Everyone",
            "My Contacts",
            "Nobody"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_privacy_settings);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                privacyOptions
        );


        Spinner phoneSpinner = findViewById(R.id.phoneSpinner);
        Spinner lastSeenSpinner = findViewById(R.id.lastSeenSpinner);
        Spinner photoSpinner = findViewById(R.id.photoSpinner);
        Spinner callSpinner = findViewById(R.id.callSpinner);


        phoneSpinner.setAdapter(adapter);
        lastSeenSpinner.setAdapter(adapter);
        photoSpinner.setAdapter(adapter);
        callSpinner.setAdapter(adapter);

    }
}

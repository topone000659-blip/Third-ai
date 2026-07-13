package com.thirdai.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CountrySelectActivity extends Activity {

    Spinner countrySpinner;
    Button continueButton;


    String[] countries = {

            " Afghanistan (+93)",
            " Albania (+355)",
            " Algeria (+213)",
            " Argentina (+54)",
            " Australia (+61)",
            " Austria (+43)",
            " Bangladesh (+880)",
            " Belgium (+32)",
            " Brazil (+55)",
            " Canada (+1)",
            " China (+86)",
            " France (+33)",
            " Germany (+49)",
            " India (+91)",
            " Indonesia (+62)",
            " Italy (+39)",
            " Japan (+81)",
            " South Korea (+82)",
            " Malaysia (+60)",
            " Myanmar (+95)",
            " Philippines (+63)",
            " Singapore (+65)",
            " Thailand (+66)",
            " United Kingdom (+44)",
            " United States (+1)",
            " Vietnam (+84)"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_country_select);


        countrySpinner = findViewById(R.id.countrySpinner);
        continueButton = findViewById(R.id.continueButton);


        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        countries
                );


        countrySpinner.setAdapter(adapter);


        continueButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    CountrySelectActivity.this,
                    PhoneNumberActivity.class
            );

            startActivity(intent);

        });

    }
}


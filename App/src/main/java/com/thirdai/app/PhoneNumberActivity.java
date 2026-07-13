package com.thirdai.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PhoneNumberActivity extends Activity {

    EditText phoneInput;
    Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_phone_number);


        phoneInput = findViewById(R.id.phoneInput);
        nextButton = findViewById(R.id.nextButton);


        nextButton.setOnClickListener(v -> {

            String phoneNumber = phoneInput.getText().toString();


            if (!phoneNumber.isEmpty()) {

                Intent intent = new Intent(
                        PhoneNumberActivity.this,
                        CodeVerificationActivity.class
                );

                intent.putExtra("phone", phoneNumber);

                startActivity(intent);

            }

        });

    }
}


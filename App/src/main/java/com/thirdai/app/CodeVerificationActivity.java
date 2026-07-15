package com.thirdai.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CodeVerificationActivity extends Activity {

    EditText codeEditText;
    Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_code_verification);

        codeEditText = findViewById(R.id.codeEditText);
        verifyButton = findViewById(R.id.verifyButton);

        verifyButton.setOnClickListener(v -> {

            String code = codeEditText.getText().toString().trim();

            if (code.equals("123456")) {

                Toast.makeText(
                        CodeVerificationActivity.this,
                        "Verification Successful",
                        Toast.LENGTH_SHORT
                ).show();

                Intent intent = new Intent(
                        CodeVerificationActivity.this,
                        MainActivity.class
                );

                startActivity(intent);
                finish();

            } else {

                Toast.makeText(
                        CodeVerificationActivity.this,
                        "Wrong Code",
                        Toast.LENGTH_SHORT
                ).show();

            }

        });
    }
}

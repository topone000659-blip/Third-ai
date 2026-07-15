package com.thirdai.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx Activity.

public class CodeVerificationActivity extends Activity {

    private EditText codeEditText;
    private Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verification);

        codeEditText = findViewById(R.id.codeEditText);
        verifyButton = findViewById(R.id.verifyButton);

        verifyButton.setOnClickListener(v -> {

            String code = codeEditText.getText().toString().trim();

            if (code.equals("123456")) {

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(
                        CodeVerificationActivity.this,
                        MainActivity.class
                );

                startActivity(intent);
                finish();

            } else {

                Toast.makeText(this,
                        "Invalid Verification Code",
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
}

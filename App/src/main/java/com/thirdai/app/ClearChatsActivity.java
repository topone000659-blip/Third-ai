package com.thirdai.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ClearChatsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear_chats);

        Button clearButton = findViewById(R.id.clearChatsButton);

        clearButton.setOnClickListener(v ->
                Toast.makeText(this, "Chat history cleared", Toast.LENGTH_SHORT).show()
        );
    }
}


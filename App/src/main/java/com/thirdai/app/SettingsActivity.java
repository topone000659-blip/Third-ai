package com.thirdai.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingsActivity extends Activity {

    String[] settings = {
            "Profile",
            "AI Settings",
            "Appearance",
            "Language",
            "Notifications",
            "Chat History",
            "Clear Chats",
            "Privacy & Security",
            "Downloads",
            "About Third AI"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        ListView listView = findViewById(R.id.settingsList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                settings
        );

        listView.setAdapter(adapter);
    }
}

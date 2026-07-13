package com.thirdai.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

        SettingsAdapter adapter = new SettingsAdapter(this, settings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = null;

            switch (position) {

                case 0:
                    intent = new Intent(this, ProfileActivity.class);
                    break;

                case 1:
                    intent = new Intent(this, AISettingsActivity.class);
                    break;

                case 2:
                    intent = new Intent(this, AppearanceActivity.class);
                    break;

                case 3:
                    intent = new Intent(this, LanguageActivity.class);
                    break;

                case 4:
                    intent = new Intent(this, NotificationActivity.class);
                    break;

                case 5:
                    intent = new Intent(this, ChatHistoryActivity.class);
                    break;

                case 6:
                    intent = new Intent(this, ClearChatsActivity.class);
                    break;

                case 7:
                    intent = new Intent(this, PrivacyActivity.class);
                    break;

                case 8:
                    intent = new Intent(this, DownloadsActivity.class);
                    break;

                case 9:
                    intent = new Intent(this, AboutActivity.class);
                    break;
            }

            if (intent != null) {
                startActivity(intent);
            }

        });
    }
}

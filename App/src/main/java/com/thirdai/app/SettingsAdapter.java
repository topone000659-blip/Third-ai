package com.thirdai.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SettingsAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] settings;

    public SettingsAdapter(Context context, String[] settings) {
        super(context, R.layout.item_setting, settings);
        this.context = context;
        this.settings = settings;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_setting, parent, false);
        }

        TextView title = convertView.findViewById(R.id.settingTitle);

        title.setText(settings[position]);

        return convertView;
    }
}

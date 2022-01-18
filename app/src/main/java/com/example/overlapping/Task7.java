package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Task7 extends AppCompatActivity {
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task7);
        label = findViewById(R.id.label);

        Bundle bundle = getIntent().getExtras();
        String countryName = bundle.getString("country_name");
        label.setText(countryName);
    }
}
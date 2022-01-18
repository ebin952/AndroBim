package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class ActivityTask7 extends AppCompatActivity {
    ListView listView;
    String[] Counties = {"India", "UK", "USA", "Canada", "France", "Japan", "Ireland"};

    ArrayAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task7_activity);
        listView = findViewById(R.id.countries);

        countryAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Counties);
        listView.setAdapter(countryAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getApplicationContext(), Task7.class);
                intent.putExtra("country_name", Counties[position]);
                startActivity(intent);

            }
        });
    }
}
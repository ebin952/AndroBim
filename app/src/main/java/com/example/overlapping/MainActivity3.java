package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btn;
    EditText name, place, day;
    String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = findViewById(R.id.button);
        name = findViewById(R.id.name);
        place = findViewById(R.id.place);
        day = findViewById(R.id.day);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toast = "Hi, "+ name.getText()+ " is at " + place.getText() + " on " + day.getText();

                Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();

            }
        });




    }
}
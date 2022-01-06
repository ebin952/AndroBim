package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTask4 extends AppCompatActivity {
    Button btn, clear;
    EditText name, place, day;
    String toast, nameEdt, placeEdt, dayEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task4_activity);

        btn = findViewById(R.id.button);
        clear = findViewById(R.id.clear_btn);
        name = findViewById(R.id.name);

        place = findViewById(R.id.place);

        day = findViewById(R.id.day);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEdt = name.getText().toString();
                placeEdt = place.getText().toString();
                dayEdt = day.getText().toString();

                if (TextUtils.isEmpty(nameEdt))
                {
                    name.setError("Enter Value");
                    return;
                }
                if (TextUtils.isEmpty(placeEdt)) {
                    place.setError("Enter Value");
                    return;

                }
                if (TextUtils.isEmpty(dayEdt)) {
                    day.setError("Enter Value");
                    return;
                }
                else{
                    toast = "Hi, " + nameEdt + " is at " + placeEdt + " on " + dayEdt;

                    Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();

                }



            }


        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {

                    name.setText("");
                    name.setHint("Enter Name");
                    place.setText("");
                    place.setHint("Enter place");
                    day.setText("");
                    day.setHint("Enter day");
                }
        });

    }

}
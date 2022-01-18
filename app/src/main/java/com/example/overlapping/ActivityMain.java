package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActivityMain extends AppCompatActivity {
        ImageView task1, task2, task3, task4, task5, task6,task7;
        TextView date;
        Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1 = findViewById(R.id.task1);
        task2 = findViewById(R.id.task2);
        task3 = findViewById(R.id.task3);
        task4 = findViewById(R.id.task4);
        task5 = findViewById(R.id.task5);
        task6 = findViewById(R.id.task6);
        task7 = findViewById(R.id.task7);
        date = findViewById(R.id.date);

        calendar = Calendar.getInstance();
        SimpleDateFormat dateView = new SimpleDateFormat("dd-MM-yyyy, HH:MM");
        String dateFormat = dateView.format(calendar.getTime()).toString();
        date.setText(dateFormat);




        task1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask1.class);
                startActivity(intent);

            }
        });

        task2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask2.class);
                startActivity(intent);

            }
        });
        task3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask3.class);
                startActivity(intent);

            }
        });

        task4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask4.class);
                startActivity(intent);

            }
        });

        task5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask5.class);
                startActivity(intent);

            }
        });

        task6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask6.class);
                startActivity(intent);

            }
        });

        task7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ActivityTask7.class);
                startActivity(intent);

            }
        });

    }





}
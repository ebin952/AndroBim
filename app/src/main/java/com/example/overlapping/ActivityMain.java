package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityMain extends AppCompatActivity {
        ImageView task1, task2, task3, task4, task5, task6;
        TextView date;
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
        date = findViewById(R.id.date);


        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateView = new SimpleDateFormat("dd-MM-yyyy, HH:MM");
        String datefrmt = dateView.format(new Date());
        date.setText(datefrmt);




        task1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task1Activity();

            }
        });

        task2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task2Activity();

            }
        });
        task3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task3Activity();

            }
        });

        task4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task4Activity();

            }
        });

        task5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task5Activity();

            }
        });

        task6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                task6Activity();

            }
        });

    }

    private void task1Activity() {
        Intent intent = new Intent(this, ActivityTask1.class);
        startActivity(intent);
    }

    private void task2Activity(){
        Intent intent = new Intent(this, ActivityTask2.class);
        startActivity(intent);

    }

    private void task3Activity(){
        Intent intent = new Intent(this, ActivityTask3.class);
        startActivity(intent);

    }

    private void task4Activity(){
        Intent intent = new Intent(this, ActivityTask4.class);
        startActivity(intent);

    }

    private void task5Activity(){
        Intent intent = new Intent(this, ActivityTask5.class);
        startActivity(intent);

    }

    private void task6Activity(){
        Intent intent = new Intent(this, ActivityTask6.class);
        startActivity(intent);

    }





}
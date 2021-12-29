package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
        ImageView task1, task2, task3, task4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1 = findViewById(R.id.task1);
        task2 = findViewById(R.id.task2);
        task3 = findViewById(R.id.task3);
        task4 = findViewById(R.id.task4);


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

    }

    private void task1Activity() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    private void task2Activity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    private void task3Activity(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }

    private void task4Activity(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }





}
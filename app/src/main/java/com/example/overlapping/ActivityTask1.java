package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTask1 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1_activity);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()
            {

                public void onClick(View view) {
                taskActivity();

            }
            });

        }

    private void taskActivity() {
        {
            Intent intent = new Intent(this, ActivityTask6.class);
            startActivity(intent);
        }
    }


}

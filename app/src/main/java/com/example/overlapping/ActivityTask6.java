package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTask6 extends AppCompatActivity {
    Button btn, clear;
    EditText name, mail, num;
    String  nameEdt, mailEdt, numEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task6_activity);

        btn = findViewById(R.id.button);
        clear = findViewById(R.id.clear_btn);
        name = (EditText) findViewById(R.id.name);

        mail = (EditText)findViewById(R.id.mail);

        num = (EditText)findViewById(R.id.num);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                name.setHint("Name");
                mail.setText("");
                mail.setHint("Mail");
                num.setText("");
                num.setHint("Number");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEdt = name.getText().toString();
                mailEdt = mail.getText().toString();
                numEdt = num.getText().toString();

                if (TextUtils.isEmpty(nameEdt))
                {
                    name.setError("Enter Value");
                    return;
                }

/*
                if(!nameEdt.matches("[a-z]"))
                {
                    name.setError("Invalid Name");
                    return;
                }
*/
                if (TextUtils.isEmpty(mailEdt)) {
                    mail.setError("Enter Value");
                    return;

                }

                if (!mailEdt.matches("[a-zA-Z0-9._-]+@[a-z]+.+[a-z]"))
                {
                    mail.setError("Invalid Email Address");
                    return;
                }

                if (TextUtils.isEmpty(numEdt)) {
                    num.setError("Enter Value");
                    return;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
                }
            }



        });





    }

}
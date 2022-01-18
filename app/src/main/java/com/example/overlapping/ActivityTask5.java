package com.example.overlapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ActivityTask5 extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    TextView text, result;

    float mValueOne, mValueTwo, value;

    boolean addition, substract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task5_activity);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        text = (TextView) findViewById(R.id.edt1);
        result = (TextView) findViewById(R.id.result);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text.getText().toString().matches("")) {
                    text.setText("+");
                    result.setText("ERROR");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    addition = true;
                    text.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().matches("")) {
                    text.setText("-");
                    result.setText("ERROR");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    substract = true;
                    text.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().matches("")) {
                    text.setText("*");
                    result.setText("ERROR");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    multiplication = true;
                    text.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().matches("")) {
                    text.setText("/");
                    result.setText("ERROR");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    division = true;
                    text.setText(null);
                }
            }
        });


        //Equal Button
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(text.getText() + "");


                value = mValueOne + mValueTwo;
                DecimalFormat format = new DecimalFormat("0.##");


                if (addition == true) {
                    value = mValueOne + mValueTwo;
                    text.setText("");
                    result.setText(format.format(value) + "");
                    addition = false;
                }

                if (substract == true) {
                    value = mValueOne - mValueTwo;
                    text.setText("");
                    result.setText(format.format(value) + "");
                    substract = false;
                }

                if (multiplication == true) {
                    value = mValueOne * mValueTwo;
                    text.setText("");
                    result.setText(format.format(value) + "");
                    multiplication = false;
                }

                if (division == true) {
                    value = mValueOne / mValueTwo;
                    text.setText("");
                    result.setText(format.format(value) + "");
                    division = false;
                }
            }
        });


        // Clear Button
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                result.setText("");
            }
        });



    }
}
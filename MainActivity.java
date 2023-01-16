package com.example.khaganboiscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView answer;
    Button add_button, minus_button, into_button, divide_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.fistValue);
        secondValue = findViewById(R.id.secondValue);
        answer = findViewById(R.id.answer);
        add_button = findViewById(R.id.add_button);
        minus_button = findViewById(R.id.minus_button);
        into_button = findViewById(R.id.into_button);
        divide_button = findViewById(R.id.divide_button);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float firstValues, secondValues, ans;
                firstValues = Integer.parseInt(firstValue.getText().toString());
                secondValues = Integer.parseInt(secondValue.getText().toString());
                ans = firstValues + secondValues;
                answer.setText("Ans is = "+ans);
            }


        });
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float firstValues, secondValues, ans;
                firstValues = Integer.parseInt(firstValue.getText().toString());
                secondValues = Integer.parseInt(secondValue.getText().toString());
                ans = firstValues - secondValues;
                answer.setText("Ans is = "+ans);
            }


        });
        into_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float firstValues, secondValues, ans;
                firstValues = Integer.parseInt(firstValue.getText().toString());
                secondValues = Integer.parseInt(secondValue.getText().toString());
                ans = firstValues * secondValues;
                answer.setText("Ans is = "+ans);
            }


        });
        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float firstValues, secondValues, ans;
                firstValues = Integer.parseInt(firstValue.getText().toString());
                secondValues = Integer.parseInt(secondValue.getText().toString());
                ans = firstValues / secondValues;
                answer.setText("Ans is = "+ans);
            }


        });


    }
}
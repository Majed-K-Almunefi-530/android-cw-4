package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);
        final TextView results = findViewById(R.id.result);
        Button addition = findViewById(R.id.add);
        Button reset = findViewById(R.id.reset);
        Button sub = findViewById(R.id.minus);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // variables

                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                TextView r = results;

                //result equation

                double result = n1 + n2;

                results.setText((int) result);
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                TextView r = results;
                double result = n1 - n2;
                results.setText((int) result);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num1.setText("");
                results.setText("");
            }

        });
    }
}
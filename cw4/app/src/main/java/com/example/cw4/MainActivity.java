package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final EditText num1 = findViewById(R.id.num1);
                final EditText num2 = findViewById(R.id.num2);
                Button plus = findViewById(R.id.plus);
                Button minus = findViewById(R.id.minus);

                plus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     string a= num1.getText().toString();
                     string b= num2.getText().toString();
                     double num1 = Double.parseDouble(a);
                     double num2 = Double.parseDouble(b);

                     double p = num1 + num2
                        Toast.makeText(MainActivity.this,"result : "+p,Toast.LENGTH_LONG).show();
                    }
                });

                minus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        string a= num1.getText().toString();
                        string b= num2.getText().toString();
                        double num1 = Double.parseDouble(a);
                        double num2 = Double.parseDouble(b);

                        double m = num1 + num2
                        Toast.makeText(MainActivity.this,"result : "+m,Toast.LENGTH_LONG).show();
                    }
                });
            }

        }

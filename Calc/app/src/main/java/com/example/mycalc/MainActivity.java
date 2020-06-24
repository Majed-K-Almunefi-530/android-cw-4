package com.example.mycalc;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
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

                double num1 = Double.parseDouble { num1.getText().toString()};
                double num2 = Double.parseDouble { num2.getText().toString()};

                double p = num1 + num2
                Toast toast = Toast.makeText(getApplicationContext(),
                        "the result is " + p,
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble { num1.getText().toString()};
                double num2 = Double.parseDouble { num2.getText().toString()};

                double m = num1 - num2
                Toast toast = Toast.makeText(getApplicationContext(),
                        "the result is " + m,
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

    }

    }

}
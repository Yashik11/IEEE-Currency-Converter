package com.example.ieeecurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    private TextView Ed;
    private EditText blank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2 = findViewById(R.id.button2);
        Ed = findViewById(R.id.Ed);
        blank = findViewById(R.id.blank);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Converting...", Toast.LENGTH_SHORT).show();
                String s = blank.getText().toString();
                int dollar = Integer.parseInt(s);
                double rupees = 77.94 * dollar;
                Ed.setText(dollar + "$ is equal to " + rupees + "Rs");
            }
        });


    }

}

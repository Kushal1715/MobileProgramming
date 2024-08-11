package com.example.labreportkushal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Lab_2q4 extends AppCompatActivity {

    private EditText editTextPrincipal, editTextRate, editTextTime;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q4);

        // Initialize the views
        editTextPrincipal = findViewById(R.id.editTextPrincipal);
        editTextRate = findViewById(R.id.editTextRate);
        editTextTime = findViewById(R.id.editTextTime);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        // Set up the button click listener
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get inputs from the EditText fields
                String principalStr = editTextPrincipal.getText().toString().trim();
                String rateStr = editTextRate.getText().toString().trim();
                String timeStr = editTextTime.getText().toString().trim();

                // Convert input strings to double values
                double principal = Double.parseDouble(principalStr);
                double rate = Double.parseDouble(rateStr);
                double time = Double.parseDouble(timeStr);

                // Calculate simple interest
                double simpleInterest = (principal * rate * time) / 100;

                // Create an Intent to start the ResultActivity
                Intent intent = new Intent(Lab_2q4.this, Lab_2q4b.class);

                // Pass the calculated simple interest to the ResultActivity
                intent.putExtra("SIMPLE_INTEREST", simpleInterest);

                // Start the ResultActivity
                startActivity(intent);
            }
        });
    }
}

package com.example.labreportkushal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab_2q4b extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q4b);

        // Initialize the TextView
        textViewResult = findViewById(R.id.textViewResult);

        // Get the simple interest passed from the MainActivity
        double simpleInterest = getIntent().getDoubleExtra("SIMPLE_INTEREST", 0);

        // Display the simple interest
        String resultText = "The calculated Simple Interest is: " + simpleInterest;
        textViewResult.setText(resultText);
    }
}

package com.example.labreportkushal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab_2q3b extends AppCompatActivity {

    private TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q3b);

        // Initialize the TextView
        textViewDisplay = findViewById(R.id.textViewDisplay);

        // Get the data passed from the MainActivity
        String name = getIntent().getStringExtra("USER_NAME");
        String email = getIntent().getStringExtra("USER_EMAIL");
        String phone = getIntent().getStringExtra("USER_PHONE");
        String address = getIntent().getStringExtra("USER_ADDRESS");

        // Display the data
        String displayText = "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address;
        textViewDisplay.setText(displayText);
    }
}

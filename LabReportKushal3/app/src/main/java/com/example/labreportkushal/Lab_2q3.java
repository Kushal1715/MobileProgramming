package com.example.labreportkushal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Lab_2q3 extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextPhone, editTextAddress;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q3);

        // Initialize the views
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextAddress = findViewById(R.id.editTextAddress);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Set up the button click listener
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get inputs from the EditText fields
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();

                // Create an Intent to start the DisplayActivity
                Intent intent = new Intent(Lab_2q3.this, Lab_2q3b.class);

                // Pass the user inputs to the DisplayActivity
                intent.putExtra("USER_NAME", name);
                intent.putExtra("USER_EMAIL", email);
                intent.putExtra("USER_PHONE", phone);
                intent.putExtra("USER_ADDRESS", address);

                // Start the DisplayActivity
                startActivity(intent);
            }
        });
    }
}

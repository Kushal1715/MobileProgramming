package com.example.labreportkushal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab_2q2 extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextAge, editTextWebsite;
    private RadioGroup radioGroupGender;
    private Button buttonSubmit;
    private TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q2);

        // Initialize the views
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextAge = findViewById(R.id.editTextAge);
        editTextWebsite = findViewById(R.id.editTextWebsite);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewDisplay = findViewById(R.id.textViewDisplay);

        // Set up the button click listener
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get inputs from the EditText fields
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String age = editTextAge.getText().toString().trim();
                String website = editTextWebsite.getText().toString().trim();

                // Get selected gender
                int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
                RadioButton selectedGender = findViewById(selectedGenderId);
                String gender = selectedGender != null ? selectedGender.getText().toString() : "Not specified";

                // Construct the display text
                String displayText = "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age + "\n" +
                        "Website: " + website;

                // Display the information
                textViewDisplay.setText(displayText);
                textViewDisplay.setVisibility(View.VISIBLE);
            }
        });
    }
}

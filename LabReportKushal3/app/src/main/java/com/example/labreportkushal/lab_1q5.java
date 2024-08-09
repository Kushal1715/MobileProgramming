package com.example.labreportkushal;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lab_1q5 extends AppCompatActivity {

    private EditText editTextUserName, editTextPassword, editTextAddress, editTextAge;
    private RadioGroup radioGroupGender;
    private DatePicker datePickerDOB;
    private Spinner spinnerState;
    private Button buttonSubmit;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1q5);

        // Initialize the views
        editTextUserName = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextAge = findViewById(R.id.editTextAge);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        datePickerDOB = findViewById(R.id.datePickerDOB);
        spinnerState = findViewById(R.id.spinnerState);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        // Set up the Spinner with states
        String[] states = {"Select a State", "Province 1", "Madhesh Pradesh", "Bagmati Province", "Gandaki", "Lumbini", "Karnali", "Sudurpaschim"};
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, states);
        spinnerState.setAdapter(stateAdapter);

        // Set up the submit button click listener
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Collect data from the input fields
                String name = editTextUserName.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();
                String age = editTextAge.getText().toString().trim();

                // Gender
                int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
                RadioButton selectedGenderButton = findViewById(selectedGenderId);
                String gender = selectedGenderButton != null ? selectedGenderButton.getText().toString() : "Not specified";

                // Date of Birth
                int day = datePickerDOB.getDayOfMonth();
                int month = datePickerDOB.getMonth() + 1;
                int year = datePickerDOB.getYear();
                String dob = day + "/" + month + "/" + year;

                // State
                String state = spinnerState.getSelectedItem().toString();

                // Display the collected data
                textViewResult.setText("User Name: " + name + "\n" +
                        "Password: " + password + "\n" +
                        "Address: " + address + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age + "\n" +
                        "Date of Birth: " + dob + "\n" +
                        "State: " + state);
                textViewResult.setVisibility(View.VISIBLE);
            }
        });
    }
}

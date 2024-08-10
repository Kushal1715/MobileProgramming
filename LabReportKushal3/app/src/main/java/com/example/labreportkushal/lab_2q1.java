package com.example.labreportkushal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class lab_2q1 extends AppCompatActivity {

    private EditText editTextNumber1, editTextOperator, editTextNumber2;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q1);

        // Initialize the views
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextOperator = findViewById(R.id.editTextOperator);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        // Set up the button click listener
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get inputs from the EditText fields
                String number1Str = editTextNumber1.getText().toString().trim();
                String operatorStr = editTextOperator.getText().toString().trim();
                String number2Str = editTextNumber2.getText().toString().trim();

                // Validate input
                if (number1Str.isEmpty() || number2Str.isEmpty() || operatorStr.isEmpty()) {
                    Toast.makeText(lab_2q1.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Parse the numbers
                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double result;

                // Perform the calculation based on the operator
                switch (operatorStr) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        if (number2 == 0) {
                            Toast.makeText(lab_2q1.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        result = number1 / number2;
                        break;
                    default:
                        Toast.makeText(lab_2q1.this, "Invalid operator", Toast.LENGTH_SHORT).show();
                        return;
                }

                // Display the result using Toast
                Toast.makeText(lab_2q1.this, "Result: " + result, Toast.LENGTH_LONG).show();
            }
        });
    }
}

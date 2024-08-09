package com.example.labreportkushal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lab1q4 extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonOK;
    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1q4);

        // Initialize the views
        editTextName = findViewById(R.id.editTextName);
        buttonOK = findViewById(R.id.buttonOK);
        textViewHello = findViewById(R.id.textViewHello);

        // Set a click listener for the button
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the name from the EditText
                String name = editTextName.getText().toString().trim();

                // Set the hello message in the TextView
                if (!name.isEmpty()) {
                    textViewHello.setText("Hello, " + name + "!");
                    textViewHello.setVisibility(View.VISIBLE);
                } else {
                    textViewHello.setText("Please enter your name.");
                    textViewHello.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

package com.example.labreportkushal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class lab_1q6 extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1q6);

        // Initialize the views
        editTextName = findViewById(R.id.editText);
        buttonSend = findViewById(R.id.buttonSend);

        // Set up the button click listener
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered name
                String text = editTextName.getText().toString().trim();

                // Create an Intent to start the SecondActivity
                Intent intent = new Intent(lab_1q6.this, lab_1q6b.class);
                intent.putExtra("TEXT", text); // Pass the name to the second activity
                startActivity(intent); // Start the second activity
            }
        });
    }
}

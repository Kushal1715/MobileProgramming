package com.example.labreportkushal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lab_1q6b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1q6b);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String text = intent.getStringExtra("TEXT");

        // Capture the layout's TextView and set the string as its text
        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText(text);
    }
}

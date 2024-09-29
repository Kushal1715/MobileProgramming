package com.example.labreportkushal;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class lab_3q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3q1);

        // Reference to the ListView
        ListView listViewStudents = findViewById(R.id.listViewStudents);

        // Array of student names
        String[] students = {
                "Ram Prasad", "Jane Smith", "Michael Johnson",
                "Emily Davis", "Sarah Brown", "Robert Wilson",
                "Jessica Garcia",
        };

        // Create an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students
        );

        // Set the adapter to the ListView
        listViewStudents.setAdapter(adapter);
    }
}

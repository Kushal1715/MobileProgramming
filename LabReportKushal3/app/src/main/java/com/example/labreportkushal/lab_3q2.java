package com.example.labreportkushal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class lab_3q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3q2);

        // Reference to the RecyclerView
        RecyclerView recyclerViewStudents = findViewById(R.id.recyclerViewStudents);

        // Set the layout manager
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));

        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe"));
        students.add(new Student("Jane Smith"));
        students.add(new Student("Michael Johnson"));
        students.add(new Student("Emily Davis"));


        // Create an adapter and set it to the RecyclerView
        StudentAdapter adapter = new StudentAdapter(students);
        recyclerViewStudents.setAdapter(adapter);
    }
}

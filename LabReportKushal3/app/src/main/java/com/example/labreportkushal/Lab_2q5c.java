package com.example.labreportkushal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Lab_2q5c extends Fragment {

    private TextView textViewDisplay;

    public Lab_2q5c() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_lab2q5c, container, false);

        // Initialize the TextView
        textViewDisplay = view.findViewById(R.id.textViewDisplay);

        // Retrieve and display the passed data (if any)
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String name = bundle.getString("USER_NAME");
            String email = bundle.getString("USER_EMAIL");
            textViewDisplay.setText("Name: " + name + "\nEmail: " + email);
        }

        return view;
    }
}

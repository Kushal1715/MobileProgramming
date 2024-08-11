package com.example.labreportkushal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;

public class Lab_2q5b extends Fragment {

    private EditText editTextName, editTextEmail;
    private Button buttonSubmit;
    private OnInputListener mListener;

    public interface OnInputListener {
        void sendInput(String name, String email);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnInputListener) {
            mListener = (OnInputListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnInputListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_lab2q5b, container, false);

        // Initialize the views
        editTextName = view.findViewById(R.id.editTextName);
        editTextEmail = view.findViewById(R.id.editTextEmail);
        buttonSubmit = view.findViewById(R.id.buttonSubmit);

        // Set up the button click listener
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();

                // Send the input data to the activity
                mListener.sendInput(name, email);
            }
        });

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}

package com.example.labreportkushal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


public class Lab_2q5 extends AppCompatActivity implements Lab_2q5b.OnInputListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2q5);

        // Load the InputFragment by default
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new Lab_2q5b())
                    .commit();
        }
    }

    @Override
    public void sendInput(String name, String email) {
        // Create a new instance of DisplayFragment and pass the data to it
        Lab_2q5c displayFragment = new Lab_2q5c();
        Bundle bundle = new Bundle();
        bundle.putString("USER_NAME", name);
        bundle.putString("USER_EMAIL", email);
        displayFragment.setArguments(bundle);

        // Replace the InputFragment with DisplayFragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, displayFragment);
        transaction.addToBackStack(null);  // Add to back stack so the user can navigate back
        transaction.commit();
    }
}

package com.example.labreportkushal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class lab_3q6 extends AppCompatActivity {

    Button btnGoToRegister, btnGoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3q6);

        btnGoToRegister = findViewById(R.id.btnGoToRegister);
        btnGoToLogin = findViewById(R.id.btnGoToLogin);

        btnGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lab_3q6.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lab_3q6.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

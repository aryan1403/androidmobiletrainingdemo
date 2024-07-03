package com.example.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    Button homebtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        homebtn = findViewById(R.id.homebtn);
        homebtn.setOnClickListener((View v) -> {
            startActivity(new Intent(LoginPage.this, MainActivity.class));
        });
    }
}

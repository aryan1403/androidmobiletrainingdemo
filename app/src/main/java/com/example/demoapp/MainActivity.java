package com.example.demoapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.demoapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    EditText myinput;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.mybtn);
        tv = findViewById(R.id.name);
        myinput = findViewById(R.id.myinput);

        btn.setOnClickListener((View v) -> {
            String name =  myinput.getText().toString();
            Toast.makeText((Context) MainActivity.this, "Name is " + name, Toast.LENGTH_LONG).show();
            tv.setText(name);

            Intent login = new Intent(MainActivity.this, LoginPage.class);
            startActivity(login);
        });


    }
}
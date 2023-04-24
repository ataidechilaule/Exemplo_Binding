package com.ataide.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ataide.exemplo.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(homeBinding.getRoot());



        Bundle extras = getIntent().getExtras();

        homeBinding.userHomeED.setText(extras.getString("user"));
        homeBinding.passHomeED.setText(extras.getString("pass"));

    }
}
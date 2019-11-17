package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AchievedCalls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achieved_calls);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

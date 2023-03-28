package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        Intent i = getIntent();
        String s = i.getStringExtra("personname");
        TextView tv = findViewById(R.id.msg);
        tv.setText("HELLO "+s+"!");


    }
}
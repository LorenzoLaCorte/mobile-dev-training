package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeText(View v)
    {
        TextView textHW = findViewById(R.id.textHW);
        textHW.setText("Updated Text!");
    }
}
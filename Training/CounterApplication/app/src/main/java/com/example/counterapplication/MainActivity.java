package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeValue(View v){
        String op = ((Button) v).getText().toString();
        Log.d(TAG, op);

        TextView stepView = findViewById(R.id.step);
        double step = Double.parseDouble(stepView.getText().toString());

        TextView t = findViewById(R.id.countValue);
        String[] words = t.getText().toString().split(" = ");
        Log.d(TAG, "currValue= " + words[1]);

        double currVal = Double.parseDouble(words[1]);
        if(op.equals("+")){
            t.setText(String.format("Value = %s", currVal + step));
        }
        else if(op.equals("-")){
            t.setText(String.format("Value = %s", currVal - step));
        }
        else {
            Log.wtf(TAG, "No Operation Associated");
        }
    }
}
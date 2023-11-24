package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(MainActivity.this);
        textView.setText("Hello world");
        textView.setTextSize(50);
        setContentView(textView);
        setContentView(R.layout.activity_main);

    }
}
package com.shruti.sectioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
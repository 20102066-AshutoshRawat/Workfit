package com.example.work_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Category extends AppCompatActivity {
    Button next;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        button = (Button) findViewById(R.id.calorietracker);
        button = (Button) findViewById(R.id.workout);
        button = (Button) findViewById(R.id.meditation);



    }
}
package com.example.work_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Personal extends AppCompatActivity {
    EditText name, age, gender, height,weight;
    Button next;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.gender);
        height = (EditText) findViewById(R.id.height);
        weight= (EditText) findViewById(R.id.weight);

        button = (Button) findViewById(R.id.next2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Personal.this, "The details have been entered", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Personal.this, Category.class);
                startActivity(intent);
            }
        });
    }
}